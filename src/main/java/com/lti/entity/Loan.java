package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Loan_det")
public class Loan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanno;
	private String acctype;
	private int amount;
	private String rate;
	private int tenuremonths;
	private int emi;
	
	public int getLoanno() {
		return loanno;
	}
	public void setLoanno(int loanno) {
		this.loanno = loanno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Loan [loanno=" + loanno + ", acctype=" + acctype + ", amount=" + amount + ", rate=" + rate
				+ ", tenuremonths=" + tenuremonths + ", emi=" + emi + "]";
	}
	public int getTenuremonths() {
		return tenuremonths;
	}
	public void setTenuremonths(int tenuremonths) {
		this.tenuremonths = tenuremonths;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}

	
	
	
	

}
