package com.project.traveleasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.project.traveleasy.entity.LocationSubset;

public interface LocationSubsetDetailsDao extends JpaRepository<LocationSubset , Integer> {

	@Query(value=
		"SELECT l.Location_Subset_Name From Location_Subset l WHERE L.LocationID= :locationid " ,
		nativeQuery = true)
		public List<String> getLocationSubsetList(int locationid);
	
	@Query(value=
			"SELECT l.Location_SubsetId From Location_Subset l WHERE L.LocationID= :locationid " ,
			nativeQuery = true)
		public List<String> getLocationSubsetIDList(int locationid);
	
	@Query(value=
			"SELECT ls.location_subsetid FROM location_subset ls\r\n"
			+ "WHERE ls.location_subset_name = :locationsubsetname ;",
			nativeQuery = true)
		public int getLocationSubsetIDByName(String locationsubsetname);
	
	@Query(value="select ld.location_name\r\n"
			+ "from location_details ld,location_subset ls\r\n"
			+ "where ld.locationid=ls.locationid \r\n"
			+ "and ls.location_subset_name= :locationsubsetname ;",
			nativeQuery = true)
		public String getParentLocation(String locationsubsetname);
	
	
	@Query(value="select ld.location_name\r\n"
			+ "from location_details ld\r\n"
			+ "where ld.location_name  like :searchtext \r\n"
			+ "union\r\n"
			+ "select ls.location_subset_name \r\n"
			+ "from location_subset ls\r\n"
			+ "where ls.location_subset_name  like :searchtext ;",
			nativeQuery = true)
		public List<String> getSuggestions(String searchtext);
	
}
