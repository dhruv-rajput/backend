package com.project.traveleasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LocationSubset")
public class LocationSubset {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "LocationSubsetID", nullable = false)
	private int LocationSubsetID;
	
	@Column(name="LocationSubsetName", nullable = false)
	private String LocationSubsetName;
	
	@Column(name="LocationID", nullable = false)
	private int LocationID;
	
	
	public LocationSubset(int locationSubsetID, String locationSubsetName, int locationID) {
		super();
		LocationSubsetID = locationSubsetID;
		LocationSubsetName = locationSubsetName;
		LocationID = locationID;
	}


	public LocationSubset() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getLocationSubsetID() {
		return LocationSubsetID;
	}


	public void setLocationSubsetID(int locationSubsetID) {
		LocationSubsetID = locationSubsetID;
	}


	public String getLocationSubsetName() {
		return LocationSubsetName;
	}


	public void setLocationSubsetName(String locationSubsetName) {
		LocationSubsetName = locationSubsetName;
	}


	public int getLocationID() {
		return LocationID;
	}


	public void setLocationID(int locationID) {
		LocationID = locationID;
	}


	@Override
	public String toString() {
		return "LocationSubset [LocationSubsetID=" + LocationSubsetID + ", LocationSubsetName=" + LocationSubsetName
				+ ", LocationID=" + LocationID + "]";
	}


}
