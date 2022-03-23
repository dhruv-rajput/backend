package com.project.traveleasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LocationDetails")
public class LocationDetails
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "LocationID", nullable = false)
	private int LocationID;
	
	@Column(name="LocationName", nullable = false)
	private String LocationName;
	
	public LocationDetails(int locationID, String locationName) {
		super();
		LocationID = locationID;
		LocationName = locationName;
	}

	public LocationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLocationID() {
		return LocationID;
	}

	public void setLocationID(int locationID) {
		LocationID = locationID;
	}

	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String locationName) {
		LocationName = locationName;
	}

	@Override
	public String toString() {
		return "LocationDetails [LocationID=" + LocationID + ", LocationName=" + LocationName + "]";
	}
	
	
	
}