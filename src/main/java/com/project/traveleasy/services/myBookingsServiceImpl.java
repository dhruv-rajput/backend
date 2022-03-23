package com.project.traveleasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.traveleasy.dao.myBookingsDao;
import com.project.traveleasy.entity.myBookings;

@Service
public class myBookingsServiceImpl implements myBookingsService {

	@Autowired
	private myBookingsDao  mybookingsdao; 
	
	@Autowired
	private BookingServiceImpl service;
	List<myBookings> list;
	
	public myBookingsServiceImpl() {
		list = new ArrayList<>();
		list.add(new myBookings(1001,"Ankush","2","manali","10-03-2022"));
		list.add(new myBookings(1002,"Ayush","delhi","manali","10-03-2022"));
		list.add(new myBookings(10077,"Aman","mumbai","pune","10-03-2022"));
		list.add(new myBookings(10077,"kartik jain","mumbai","pune","10-03-2022"));
		list.add(new myBookings(10077,"Kartik","mumbai","pune","10-03-2022"));
		list.add(new myBookings(1001,"Ankush","delhi","manali","10-03-2022"));
		list.add(new myBookings(1002,"Ayush","delhi","manali","10-03-2022"));
		list.add(new myBookings(10077,"Aman","mumbai","pune","10-03-2022"));
		list.add(new myBookings(10077,"kartik jain","mumbai","pune","10-03-2022"));
		list.add(new myBookings(10077,"Kartik","mumbai","pune","10-03-2022"));

	}
	
	@Override
	public List<myBookings> getMyBookings(int userId) {
		// TODO Auto-generated method stub
		
		
		list=this.mybookingsdao.getMyBookingsDao(userId);
		for(myBookings row:list)
		{
			int lf =   Integer.parseInt(row.getLocation_from());
			row.setLocation_from(service.getLocationSubsetByID(lf));
			
			int lt = Integer.parseInt(row.getLocation_to());
			row.setLocation_to(service.getLocationSubsetByID(lt));	

		}
		return list;
	}

	 
	

}
