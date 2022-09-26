package com.lti.entity;

import javax.persistence.*;

@Entity
@Table(name="Admin_det")
public class Admin {
	@Id
	String Email_Id;
	String Password;
	
	
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [Email_Id=" + Email_Id + ", Password=" + Password + "]";
	}

}
