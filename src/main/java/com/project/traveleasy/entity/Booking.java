package com.project.traveleasy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity 
@Table(name="BookingDetails")
public class Booking{
	
	@Id
	@GeneratedValue()
	@JsonIgnore
	private Integer BookingID;
	
	private int UserID;
	private int BusID;
	private int ScheduledJourneyID;
	
	@JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "booking")
	private List<Passengers> passengers;

	public Booking(int bookingID, int userID, int busID, int scheduledJourneyID, List<Passengers> passengers) {
		super();
		BookingID = bookingID;
		UserID = userID;
		BusID = busID;
		ScheduledJourneyID = scheduledJourneyID;
		this.passengers = passengers;
	}

	public Booking() {
		super();
	}

	public int getBookingID() {
		return BookingID;
	}

	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getBusID() {
		return BusID;
	}

	public void setBusID(int busID) {
		BusID = busID;
	}

	public int getScheduledJourneyID() {
		return ScheduledJourneyID;
	}

	public void setScheduledJourneyID(int scheduledJourneyID) {
		ScheduledJourneyID = scheduledJourneyID;
	}

	public List<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Booking [BookingID=" + BookingID + ", UserID=" + UserID + ", BusID=" + BusID + ", ScheduledJourneyID="
				+ ScheduledJourneyID + ", passengers=" + passengers + "]";
	}
	 
	 
	 
}