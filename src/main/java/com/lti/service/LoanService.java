package com.lti.service;

import java.util.List;

import com.lti.entity.Loan;
import com.lti.exception.NoLoandetailsFound;


public interface LoanService {
	public Loan createLoandetails(Loan l);
	public Loan findLoanbyId(int loanno) throws NoLoandetailsFound;
	public Loan updateLoanbyId(int loanno,Loan l) throws NoLoandetailsFound;
	public Loan deleteLoanbyId(int loanno) throws NoLoandetailsFound;
	public List<Loan> allLoansList();

}
