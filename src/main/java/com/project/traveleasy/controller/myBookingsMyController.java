package com.project.traveleasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.traveleasy.entity.myBookings;
import com.project.traveleasy.services.myBookingsService;


@RestController
@CrossOrigin(origins = "*")

public class myBookingsMyController {
	
	@Autowired
	private myBookingsService bookingsService;
	
	@GetMapping("/myBookingsDemo")
	public String getbookings() {
	
		return "hello welcome to the booking page";
	}
	
	@GetMapping("/myBookings/{userId}")
	public List<myBookings> getMyBookings(@PathVariable int userId)
	{
		return this.bookingsService.getMyBookings(userId);
		
	}
	
	

}
//to convert string to long 
//long.parseLong(userID)