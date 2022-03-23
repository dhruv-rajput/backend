package com.project.traveleasy.services;




import com.project.traveleasy.entity.UserData;
import com.project.traveleasy.entity.UserDetails;

import antlr.collections.List;

public interface UserService {
   
	public String loginPage(UserDetails user);

	public String addUser(UserData user);

	List getUsers();

	//public String addUser(UserDetails user);

	    
}

