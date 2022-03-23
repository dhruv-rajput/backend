package com.project.traveleasy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.traveleasy.dao.MyProfiledao;
import com.project.traveleasy.entity.UserData;


@Service
public class MyProfileServiceImpl implements MyProfileService{
	@Autowired
	private MyProfiledao myprofiledao;
	
	
	@Override
	public UserData getprofile(Integer ID) {
		Optional<UserData> optional= myprofiledao.findById(ID);
		
		return optional.get();
		
	}

	@Override
	public void editprofile(UserData userdata) {
	 myprofiledao.save(userdata);
			
	}
	

}
