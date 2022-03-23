package com.project.traveleasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.traveleasy.entity.UserData;
import com.project.traveleasy.entity.UserDetails;
import com.project.traveleasy.services.UserService;



@RestController
@CrossOrigin(origins="*")
public class LoginController {
	 @Autowired     
	private UserService userService;
@PostMapping("/login")
public String loginPage(@RequestBody UserDetails user) {

 
    return this.userService.loginPage(user);
}

@PostMapping("/signup")
	public String addUser(@RequestBody UserData user) {

		return this.userService.addUser(user);
         
	}
@GetMapping("/")
public String hello() {
	return "hello";
}

}