package com.project.traveleasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.traveleasy.entity.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer>{

}



