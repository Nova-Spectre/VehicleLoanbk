package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
@Entity
@Table(name = "User_Detail")
public class UserDetails {
	@Id
	int u_id;
	String u_name;
	String u_email;
	int mob_no;
	String gender;
	int age;
	String city;
	String State;
	int pincode;
	String address;
	String password;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public int getMob_no() {
		return mob_no;
	}
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [u_id=" + u_id + ", u_name=" + u_name + ", u_email=" + u_email + ", mob_no=" + mob_no
				+ ", gender=" + gender + ", age=" + age + ", city=" + city + ", State=" + State + ", pincode=" + pincode
				+ ", address=" + address + ", password=" + password + "]";
	}
	
	

}
