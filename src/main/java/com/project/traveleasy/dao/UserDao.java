package com.project.traveleasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.traveleasy.entity.UserData;

public interface UserDao extends JpaRepository<UserData,Integer>{
	public UserData findByEmail(String email);   
}
