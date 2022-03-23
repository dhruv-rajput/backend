package com.project.traveleasy.entity;

public class SeatStatus {
	
	public int seatId;
	public int seatnumber;
	public int status;
	
	public SeatStatus( int seatId, int seatNumber, int status) {
		super();
		this.seatId = seatId;
		this.seatnumber = seatNumber;
		this.status = status;
	}

	public SeatStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
