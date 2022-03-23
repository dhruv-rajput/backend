package com.project.traveleasy.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.traveleasy.dao.BusDetailsDao;
import com.project.traveleasy.dao.LocationDetailsDao;
import com.project.traveleasy.dao.LocationSubsetDetailsDao;
import com.project.traveleasy.dao.ScheduledJourneyDao;
import com.project.traveleasy.dao.SeatDetailsDao;
import com.project.traveleasy.entity.BusDetails;
import com.project.traveleasy.entity.SeatStatus;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private LocationDetailsDao locationdetailsdao;
	
	@Autowired
	private LocationSubsetDetailsDao locationsubsetdetailsdao;
	
	@Autowired
	private SeatDetailsDao seatdetailsdao;
	
	@Autowired
	private ScheduledJourneyDao scheduledjourneydao;
	
	@Autowired
	private BusDetailsDao busdetailsdao;
	
	
	@Override
	public String getLocationByID(int LocationID) {
		return locationdetailsdao.getById(LocationID).getLocationName();	
	}

	
	@Override
	public String getLocationSubsetByID(int LocationSubsetID) {	
	return locationsubsetdetailsdao.getById(LocationSubsetID).getLocationSubsetName();
	}

	
	@Override
	public List<String> getLocationSubsetList(int LocationID) {
		return locationsubsetdetailsdao.getLocationSubsetList(LocationID);
	
	}


	@Override
	public List<String> getLocationSubsetListByName(String LocationName) {	
		
		String parentlocation;
		parentlocation=locationsubsetdetailsdao.getParentLocation(LocationName);
		if(parentlocation!=null)LocationName =parentlocation;
		
		int LocationID=Integer.parseInt(locationdetailsdao.getLocationIDbyName(LocationName).get(0)) ;	
		return getLocationSubsetList(LocationID);
	}


	@Override
	public List<SeatStatus> getSeatStatus(int BusID, String dateofbooking) {

	List<SeatStatus> res = new ArrayList<>();
	List<String> occupiedIDList= seatdetailsdao.getOccupiedSeatIDList(BusID,dateofbooking);

	List<String> SeatIDList= seatdetailsdao.getSeatIDList(BusID);

	for(int i=1;i<=SeatIDList.size();i++) {
	res.add(new SeatStatus( Integer.parseInt(SeatIDList.get(i-1)) ,i,0));
	}


	SeatStatus last=res.get(res.size()-1);
	int diff=last.seatId-last.seatnumber;
	for(String s:occupiedIDList) {
	res.get(Integer.parseInt(s)-1-diff).status=1;
	}

	return res;
	}


	
	
	@Override
	public List<BusDetails> getBusList(String from, String to, String date) {
		
		String parentlocation;
		parentlocation=locationsubsetdetailsdao.getParentLocation(from);
		if(parentlocation!=null)from =parentlocation;
		
		parentlocation=locationsubsetdetailsdao.getParentLocation(to);
		if(parentlocation!=null)to =parentlocation;
		
		List<BusDetails> res=new ArrayList<>();
		int LocationID;
		Set<Integer> setOfBusID = new HashSet<Integer>();
		
		
		
		LocationID=Integer.parseInt(locationdetailsdao.getLocationIDbyName(from).get(0)) ;
		List<String> subsetFrom = locationsubsetdetailsdao.getLocationSubsetIDList(LocationID);

//	System.out.println(LocationID);
//		for(String t:subsetFrom)System.out.println(t);
		
		
		
		LocationID=Integer.parseInt(locationdetailsdao.getLocationIDbyName(to).get(0)) ;
		List<String> subsetTo = locationsubsetdetailsdao.getLocationSubsetIDList(LocationID);
		
//	System.out.println(LocationID);
//		for(String t:subsetTo)System.out.println(t);
		
		
		
		for(int i=0;i<subsetFrom.size();i++)
			for(int j=0;j<subsetTo.size();j++)
			{	
//				System.out.println("Query " +subsetFrom.get(i)+" and " + subsetTo.get(j) + "--");
				List<String> s=scheduledjourneydao.getPossibleBus(subsetFrom.get(i), subsetTo.get(j),date);
//				for(String t:s)System.out.println(t);
				
				for (int k=0;k<s.size();k++)
					setOfBusID.add(Integer.parseInt(s.get(k)));	
			}
			
		
		for(int t:setOfBusID) {
			BusDetails bd= busdetailsdao.getById(t);
			res.add(new BusDetails(
					bd.getBusID(),bd.getBusName(),bd.getBusNumberPlate(),bd.getNumberOfSeats(),
					bd.getCreatedBy(),bd.getCreatedDate(),bd.getModifiedBy(),bd.getModifiedDate()
					));
		}
		
		return res;
	}


	@Override
	public int getScheduledJourneyID(String from, String to, int BusID, String date) {
		
		return scheduledjourneydao.getScheduledJourneyID(
				getLocationSubsetIDByName(from), 
				getLocationSubsetIDByName(to), 
				BusID, date);
	}


	@Override
	public int getLocationSubsetIDByName(String LocationSubsetName) {
		
		return locationsubsetdetailsdao.getLocationSubsetIDByName(LocationSubsetName);
	}


	@Override
	public List<String> getSuggestions(String searchtext) {
	
		return locationsubsetdetailsdao.getSuggestions('%'+searchtext+'%');
	}
	
	

}
