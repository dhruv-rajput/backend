package com.project.traveleasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.traveleasy.dao.UserDao;
import com.project.traveleasy.entity.UserData;
import com.project.traveleasy.entity.UserDetails;

import antlr.collections.List;

@Service
public class UserServiceImpl implements UserService{
    
	//private static final User NULL = null;
	@Autowired
	private UserDao userDao;
	@Override
	public String addUser(UserData user) {
		String nemail=user.getEmail();
		UserData temp=userDao.findByEmail(nemail);
		if(temp!=null) {
			return "user already exists";
		}
		else{
			userDao.save(user);
	        return "Success";
		}
		    
	        
	}
    
	@Override
	public List getUsers(){
		return null;
	
	}
	
	@Override
	public String loginPage(UserDetails user) {
		String nemail=user.getEmail();
		try {
		UserData temp=userDao.findByEmail(nemail);
		if(user.getPassword().equals(temp.getPassword())) {
			return String.valueOf(temp.getUserId());
		}
		else {
			//return temp.getPassword();
	     return "password is incorrect";
		}
		}
		catch(Exception ex){
			return "user doesn't exist, SignUp now";
		}
	
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	
   
}
