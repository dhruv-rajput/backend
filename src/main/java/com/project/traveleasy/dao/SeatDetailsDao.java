package com.project.traveleasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.traveleasy.entity.SeatDetails;

public interface SeatDetailsDao extends JpaRepository<SeatDetails, Integer> {

	@Query(value=" SELECT p.seatid \r\n"
			+ "from scheduled_journey sj, booking_details bd, passengers p\r\n"
			+ "where sj.busid= :BusID and sj.journey_date = :dateofbooking \r\n"
			+ "and bd.scheduled_journeyid=sj.scheduled_journeyid\r\n"
			+ "and p.booking_bookingid=bd.bookingid ",nativeQuery=true)
	public List<String> getOccupiedSeatIDList(int BusID,String dateofbooking);

	@Query(value="SELECT seatid FROM seat_details WHERE busid = :BusID ",nativeQuery = true)
	public List<String> getSeatIDList(int BusID);
	
}
