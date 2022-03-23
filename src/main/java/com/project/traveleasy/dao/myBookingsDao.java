package com.project.traveleasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.traveleasy.entity.myBookings;

public interface myBookingsDao extends JpaRepository<myBookings, Integer > {

	@Query(value=" select p.age, p.name, sj.location_subset_fromid , sj.location_subset_toid , sj.journey_date\n"
			+ "from booking_details bd, scheduled_journey sj, passengers p\n"
			+ "where bd.userid= :userID \n"
			+ "and bd.scheduled_journeyid=sj.scheduled_journeyid\n"
			+ "and p.bookingid=bd.bookingid;  ",nativeQuery = true )
	public List<myBookings> getMyBookingsDao(int userID);
	
}
