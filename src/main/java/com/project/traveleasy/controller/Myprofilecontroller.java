package com.project.traveleasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.traveleasy.entity.UserData;
import com.project.traveleasy.services.MyProfileService;



@RestController
@CrossOrigin(origins="*")
public class Myprofilecontroller {

	@Autowired
	private MyProfileService myprofileservice;
	
	@GetMapping("/profile")
	public String home()
	{
		return "Welcome to the home";
	}
 
/*	@GetMapping("/myprofile/{ID}")
	public UserData getprofile(@PathVariable Integer ID)
	{
		return this.myprofileservice.getprofile(ID);
	}

*/
	@PostMapping("/myprofile")
	public UserData getprofile(@RequestBody String ID)
	{
		return this.myprofileservice.getprofile(Integer.parseInt(ID));
	}
	
	
	@PutMapping("/myprofile/edit")
	public void editprofile(@RequestBody UserData userdata)
	{
		this.myprofileservice.editprofile(userdata);
	}

}
