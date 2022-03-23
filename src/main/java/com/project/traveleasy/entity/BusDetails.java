package com.project.traveleasy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BusDetails")
public class BusDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BusID", nullable = false)
	private int BusID;

	@Column(name="BusName", nullable = false)
	private String BusName;
	
	@Column(name="BusNumberPlate", nullable = false)
	private String BusNumberPlate;
	
	@Column(name="NumberOfSeats", nullable = false)
	private int NumberOfSeats;
	
	@Column(name="CreatedBy", nullable = true)
	private String CreatedBy;
	
	@Column(name="CreatedDate", nullable = true)
	private Date CreatedDate;
	
	@Column(name="ModifiedBy", nullable = true)
	private String ModifiedBy;
	
	@Column(name="ModifiedDate", nullable = true)
	private Date ModifiedDate;
	
	
	public BusDetails(int busID, String busName, String busNumberPlate, int numberOfSeats, String createdBy,
			Date createdDate, String modifiedBy, Date modifiedDate) {
		super();
		BusID = busID;
		BusName = busName;
		BusNumberPlate = busNumberPlate;
		NumberOfSeats = numberOfSeats;
		CreatedBy = createdBy;
		CreatedDate = createdDate;
		ModifiedBy = modifiedBy;
		ModifiedDate = modifiedDate;
	}


	public BusDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getBusID() {
		return BusID;
	}


	public void setBusID(int busID) {
		BusID = busID;
	}


	public String getBusName() {
		return BusName;
	}


	public void setBusName(String busName) {
		BusName = busName;
	}


	public String getBusNumberPlate() {
		return BusNumberPlate;
	}


	public void setBusNumberPlate(String busNumberPlate) {
		BusNumberPlate = busNumberPlate;
	}


	public int getNumberOfSeats() {
		return NumberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}


	public String getCreatedBy() {
		return CreatedBy;
	}


	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}


	public Date getCreatedDate() {
		return CreatedDate;
	}


	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}


	public String getModifiedBy() {
		return ModifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}


	public Date getModifiedDate() {
		return ModifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}


	@Override
	public String toString() {
		return "BusDetails [BusID=" + BusID + ", BusName=" + BusName + ", BusNumberPlate=" + BusNumberPlate
				+ ", NumberOfSeats=" + NumberOfSeats + ", CreatedBy=" + CreatedBy + ", CreatedDate=" + CreatedDate
				+ ", ModifiedBy=" + ModifiedBy + ", ModifiedDate=" + ModifiedDate + "]";
	}
		                                                                                                          
	
	
}
