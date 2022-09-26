package com.lti.service;

import java.util.List;

import com.lti.entity.Loan;
import com.lti.entity.UserDetails;
import com.lti.entity.Vehicle;
import com.lti.exception.NoLoandetailsFound;
import com.lti.exception.NoUserFoundException;
import com.lti.exception.NoVehicleFoundException;

public interface Adminservice {
	
public UserDetails createUserDetails(UserDetails u);
	
	public List<UserDetails> listOfUserDetails();
	public UserDetails findUserDetailsById(int u_id) throws NoUserFoundException;
	public UserDetails updateUserDetailsById(int u_id,UserDetails u) throws NoUserFoundException;
	public UserDetails deleteUserDetailsById(int u_id) throws NoUserFoundException;

	public Vehicle createVehicledetails(Vehicle v);
	public Vehicle findVehiclebyId(int vid) throws NoVehicleFoundException;
	public Vehicle updateVehiclebyId(int vid,Vehicle v) throws NoVehicleFoundException;
	public Vehicle deleteVehiclebyId(int vid) throws NoVehicleFoundException;
	public List<Vehicle> allVehiclesList();
	
	public Loan createLoandetails(Loan l);
	public Loan findLoanbyId(int loanno) throws NoLoandetailsFound;
	public Loan updateLoanbyId(int loanno,Loan l) throws NoLoandetailsFound;
	public Loan deleteLoanbyId(int loanno) throws NoLoandetailsFound;
	public List<Loan> allLoansList();
	
	public List<UserDetails> getnoOfApprovedLoans();

}
