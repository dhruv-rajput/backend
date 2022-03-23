package com.project.traveleasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SeatDetails")
public class SeatDetails {

	@Id
	@Column(name="SeatID", nullable = false)
	private int SeatID;
	
	@Column(name="BusID", nullable = false)
	private int BusID;
	
	@Column(name="SeatNumber", nullable = false)
	private int SeatNumber;

	public SeatDetails(int seatID, int busID, int seatNumber) {
		super();
		SeatID = seatID;
		BusID = busID;
		SeatNumber = seatNumber;
	}

	public SeatDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSeatID() {
		return SeatID;
	}

	public void setSeatID(int seatID) {
		SeatID = seatID;
	}

	public int getBusID() {
		return BusID;
	}

	public void setBusID(int busID) {
		BusID = busID;
	}

	public int getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "SeatDetails [SeatID=" + SeatID + ", BusID=" + BusID + ", SeatNumber=" + SeatNumber + "]";
	}
	


}
