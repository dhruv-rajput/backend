package com.project.traveleasy.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.traveleasy.entity.UserData;




public interface MyProfiledao extends JpaRepository<UserData, Integer>{
  
      
}

