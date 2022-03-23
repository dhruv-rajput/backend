package com.project.traveleasy.services;

import com.project.traveleasy.entity.UserData;

public interface MyProfileService {
    public UserData getprofile(Integer ID);
	
	public void editprofile(UserData userdata);

}
