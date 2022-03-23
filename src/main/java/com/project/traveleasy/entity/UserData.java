package com.project.traveleasy.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")

public class UserData {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="UserID")
     private int userId;
	 
	 @Column(name="name")
     private String username;
	 
	 @Column(name="Email")
     private String email;
	 
	 @Column(name="Phone")
     private String phone;
	 
	 @Column(name="Password")
     private String password;
	 
	 @Column(name="City")
     private String city;
	 
	 @Column(name="Gender")
     private String gender;
	 
	 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public UserData(int userId, String username, String email, String phone, String password, String city,
			String gender) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.city = city;
		this.gender = gender;
	}
	public UserData() {
		super();

	}
     
     
     
     
     
}
