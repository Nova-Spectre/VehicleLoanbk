package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Loan;
import com.lti.exception.NoLoandetailsFound;
import com.lti.service.LoanService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoanController {
	@Autowired
	private LoanService lser;
	
	
	@GetMapping("/Loan")
	public List<Loan> getallloan(){
		return lser.allLoansList();
	}
	
	@GetMapping("/Loan/{loanno}")
	public Loan vehiclegetById(@PathVariable("loanni")int loanno) throws NoLoandetailsFound{
		return lser.findLoanbyId(loanno);
	}
	
	//
	
	
	@PostMapping("/Loan")
	public Loan createLoanbyId(@RequestBody Loan l){
		return lser.createLoandetails(l);
	}
	
	@PutMapping("/Loan/{loanno}")
	public Loan ModifyLoanbyId(@PathVariable("loanno")int loanno,@RequestBody Loan l) throws  NoLoandetailsFound {
		return lser.updateLoanbyId(loanno, l);
	}
	
	@DeleteMapping("/Loan/{loanno}")
	public Loan removeLoanbyId(@PathVariable("loanno")int loanno) throws NoLoandetailsFound{
		return lser.deleteLoanbyId(loanno);
	}
	


}
