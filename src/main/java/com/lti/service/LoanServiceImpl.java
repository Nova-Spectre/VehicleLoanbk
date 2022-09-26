package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.LoanRepository;
import com.lti.dao.VehicleRepository;
import com.lti.entity.Loan;
import com.lti.entity.Vehicle;
import com.lti.exception.NoLoandetailsFound;
import com.lti.exception.NoVehicleFoundException;

@Service
public class LoanServiceImpl implements LoanService {
	@Autowired
	private LoanRepository lRepo;

	@Override
	@Transactional
	public Loan createLoandetails(Loan l) {
		// TODO Auto-generated method stub
		return lRepo.save(l);
	}

	@Override
	public Loan findLoanbyId(int loanno) throws NoLoandetailsFound {
		// TODO Auto-generated method stub
		Optional<Loan> vfind = lRepo.findById(loanno);
		Loan loan=null;
		if(vfind.isPresent()) {
			loan=vfind.get();
		
		}
		else
		{
			throw new NoLoandetailsFound("Loan Details not found");
		}
		return loan;
	}

	@Override
	public Loan updateLoanbyId(int loanno, Loan l) throws NoLoandetailsFound {
		// TODO Auto-generated method stub
		Optional<Loan> vfind = lRepo.findById(loanno);
		Loan loan=null;
		if(vfind.isPresent()) {
			loan=vfind.get();
			lRepo.save(l);
		
		}
		else
		{
			throw new NoLoandetailsFound("Loan Details not found");
		}
		return l;
	}

	@Override
	public Loan deleteLoanbyId(int loanno) throws NoLoandetailsFound {
		// TODO Auto-generated method stub
		Optional<Loan> vfind = lRepo.findById(loanno);
		Loan loan=null;
		if(vfind.isPresent()) {
			loan=vfind.get();
			lRepo.delete(loan);
		
		}
		else
		{
			throw new NoLoandetailsFound("Loan Details not found");
		}
		return loan;
	}

	@Override
	public List<Loan> allLoansList() {
		// TODO Auto-generated method stub
		return lRepo.findAll();
	}

}
