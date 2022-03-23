package com.project.traveleasy.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "passengers")
public class Passengers{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer PassengerID;
	
	@JsonBackReference
	@ManyToOne
	private Booking booking;
	
	private int SeatID;

	private int Age;
	private String Name;
	private String Gender;
	public Passengers(int passengerID, Booking booking, int seatID, int age, String name, String gender) {
		super();
		PassengerID = passengerID;
		this.booking = booking;
		SeatID = seatID;
		Age = age;
		Name = name;
		Gender = gender;
	}
	public Passengers() {
		super();
	}
	public int getPassengerID() {
		return PassengerID;
	}
	public void setPassengerID(int passengerID) {
		PassengerID = passengerID;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public int getSeatID() {
		return SeatID;
	}
	public void setSeatID(int seatID) {
		SeatID = seatID;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	
}