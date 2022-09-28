package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Vehicle_detail")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	
	private String vname;
	private String vmodel;
	private int showroomprice;
	private int onroadprice;
	private long aadharcardno;
	private String pancardno;
	private boolean photo;
	private String employmenttypes;
	private boolean salaryslip;
	private int annualsalary;
	private boolean existingemi;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_vehicle_id" )//referencedColumnName = "vid")
	private Loan loan;
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
	public int getShowroomprice() {
		return showroomprice;
	}
	public void setShowroomprice(int showroomprice) {
		this.showroomprice = showroomprice;
	}
	public int getOnroadprice() {
		return onroadprice;
	}
	public void setOnroadprice(int onroadprice) {
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
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public void setExistingemi(boolean existingemi) {
		this.existingemi = existingemi;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vmodel=" + vmodel + ", showroomprice=" + showroomprice
				+ ", onroadprice=" + onroadprice + ", aadharcardno=" + aadharcardno + ", pancardno=" + pancardno
				+ ", photo=" + photo + ", employmenttypes=" + employmenttypes + ", salaryslip=" + salaryslip
				+ ", annualsalary=" + annualsalary + ", existingemi=" + existingemi + ", loan=" + loan + "]";
	}
	

	
	
	
	
	
	

}
