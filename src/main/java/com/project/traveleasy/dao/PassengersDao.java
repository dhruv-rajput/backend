package com.project.traveleasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.traveleasy.entity.Passengers;

public interface PassengersDao extends JpaRepository<Passengers, Integer> {

}
