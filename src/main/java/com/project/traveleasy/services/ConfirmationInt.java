package com.project.traveleasy.services;

import java.util.List;

import com.project.traveleasy.entity.Booking;


public interface ConfirmationInt {

	public String addBooking(Booking booking);
	public List<Booking> getBooking();
}
