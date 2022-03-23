package com.project.traveleasy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class myBookings {
    @Id
	private int age;
	private String name;
	private String location_subset_fromid;
	private String  location_subset_toid ;
	private String  journey_date ;
	public myBookings(int age, String name, String location_from, String location_to, String date_of_travel) {
		super();
		this.age = age;
		this.name = name;
		this.location_subset_fromid = location_from;
		this.location_subset_toid = location_to;
		this.journey_date = date_of_travel;
	}
	public myBookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation_from() {
		return location_subset_fromid;
	}
	public void setLocation_from(String location_from) {
		this.location_subset_fromid = location_from;
	}
	public String getLocation_to() {
		return location_subset_toid;
	}
	public void setLocation_to(String location_to) {
		this.location_subset_toid = location_to;
	}
	public String getDate_of_travel() {
		return journey_date;
	}
	public void setDate_of_travel(String date_of_travel) {
		this.journey_date = date_of_travel;
	}
	@Override
	public String toString() {
		return "myBookings [age=" + age + ", name=" + name + ", location_from=" + location_subset_fromid + ", location_to="
				+ location_subset_toid + ", date_of_travel=" + journey_date + "]";
	}
	
	
	
}
