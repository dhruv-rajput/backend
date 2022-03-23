package com.project.traveleasy.services;

import java.util.List;

import com.project.traveleasy.entity.BusDetails;
import com.project.traveleasy.entity.SeatStatus;

public interface BookingService {

		public String getLocationByID(int LocationID);
	
		public String getLocationSubsetByID(int LocationSubsetID);
		
		public List<String> getLocationSubsetList(int LocationID);
		
		public List<String> getLocationSubsetListByName(String LocationName);
		
		public List<SeatStatus> getSeatStatus(int BusID,String dateofbooking);
			
		public List<BusDetails> getBusList(String from, String to, String date );
		
		public int getLocationSubsetIDByName(String Name);
		
		public int getScheduledJourneyID(String from, String to, int BusID, String date);
		
		public List<String> getSuggestions(String searchtext);
		
}
