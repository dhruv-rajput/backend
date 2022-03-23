package com.project.traveleasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.traveleasy.entity.ScheduledJourney;

public interface ScheduledJourneyDao extends JpaRepository<ScheduledJourney, Integer> {
	
	@Query(value="SELECT u.busid FROM scheduled_journey u \r\n"
			+ "where u.location_subset_fromid= :from \r\n"
			+ "and u.location_subset_toid = :to \r\n"
			+ "and u.journey_date= :date ;"
			, nativeQuery=true)
	public List<String> getPossibleBus(String from, String to,String date);
	
	@Query(value = "SELECT sj.scheduled_journeyid FROM scheduled_journey sj \r\n"
			+ "where sj.location_subset_fromid = :from \r\n"
			+ "and sj.location_subset_toid = :to \r\n"
			+ "and sj.busid = :busID \r\n"
			+ "and sj.journey_date = :date ; "
			, nativeQuery = true)
	public int getScheduledJourneyID(int from, int to,int busID, String date);
	
}
