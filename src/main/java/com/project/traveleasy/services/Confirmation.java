package com.project.traveleasy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.traveleasy.dao.BookingDao;
import com.project.traveleasy.entity.Booking;
import com.project.traveleasy.entity.Passengers;


@Service
public class Confirmation implements ConfirmationInt {
	
	@Autowired 
	private BookingDao bookingDao;
	
	//@Autowired 
	//private PassengersDao passengersDao;
	
	
	List <Booking> BookingList;
	List <Passengers> PassengerList;
	
	public Confirmation() {
		
		//Booking booking = new Booking();
		//booking.setBookingID(3);
		//booking.setBusID(4);
		//booking.setScheduledJourneyID(7);
		//booking.setUserID(4); 
		
		//bookingDao.save(booking);
		//Passengers passenger1 =  new Passengers(6, booking, 6, 6, "John", "Male");
		//Passengers passenger2 =  new Passengers(6, booking, 6, 4,"h", "h");
		
		//passengersDao.save(passenger1);
		//passengersDao.save(passenger2);
		
	}
	

	@Override
	public String addBooking(Booking booking) {
		bookingDao.save(booking);
		return "Booking is done";
	}

	@Override
	public List<Booking> getBooking() {
		return bookingDao.findAll();
	}

	


}
