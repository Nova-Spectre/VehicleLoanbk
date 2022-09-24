package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Vehicle_detail")
public class Vehicle {
	
	@Id
	private int vid;
	
	private String vname;
	private String vmodel;
	private String showroomprice;
	private String onroadprice;
	private long aadharcardno;
	private String pancardno;
	private boolean photo;
	private String employmenttypes;
	private boolean salaryslip;
	private int annualsalary;
	private boolean existingemi;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public String getShowroomprice() {
		return showroomprice;
	}
	public void setShowroomprice(String showroomprice) {
		this.showroomprice = showroomprice;
	}
	public String getOnroadprice() {
		return onroadprice;
	}
	public void setOnroadprice(String onroadprice) {
		this.onroadprice = onroadprice;
	}
	public long getAadharcardno() {
		return aadharcardno;
	}
	public void setAadharcardno(long aadharcardno) {
		this.aadharcardno = aadharcardno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	public boolean isPhoto() {
		return photo;
	}
	public void setPhoto(boolean photo) {
		this.photo = photo;
	}
	public String getEmploymenttypes() {
		return employmenttypes;
	}
	public void setEmploymenttypes(String employmenttypes) {
		this.employmenttypes = employmenttypes;
	}
	public boolean isSalaryslip() {
		return salaryslip;
	}
	public void setSalaryslip(boolean salaryslip) {
		this.salaryslip = salaryslip;
	}
	public int getAnnualsalary() {
		return annualsalary;
	}
	public void setAnnualsalary(int annualsalary) {
		this.annualsalary = annualsalary;
	}
	public boolean isExistingemi() {
		return existingemi;
	}
	public void setExistingemi(boolean existingemi) {
		this.existingemi = existingemi;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vmodel=" + vmodel + ", showroomprice=" + showroomprice
				+ ", onroadprice=" + onroadprice + ", aadharcardno=" + aadharcardno + ", pancardno=" + pancardno
				+ ", photo=" + photo + ", employmenttypes=" + employmenttypes + ", salaryslip=" + salaryslip
				+ ", annualsalary=" + annualsalary + ", existingemi=" + existingemi + "]";
	}
	

	
	
	
	
	
	

}
