package com.project.traveleasy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.traveleasy.entity.LocationDetails;

public interface LocationDetailsDao extends JpaRepository<LocationDetails, Integer> {

	
	@Query(value=
			"SELECT l.Locationid From Location_details l WHERE L.Location_name= :locationname " ,
			nativeQuery = true)
		public List<String> getLocationIDbyName(String locationname);
}
