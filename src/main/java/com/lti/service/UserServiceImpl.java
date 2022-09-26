package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserDetailsRepository;
import com.lti.entity.UserDetails;
import com.lti.exception.NoUserFoundException;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDetailsRepository uRepo;

	@Transactional
	@Override
	public UserDetails createUserDetails(UserDetails u) {
		// TODO Auto-generated method stub
		return uRepo.save(u);
	}

	@Override
	public List<UserDetails> listOfUserDetails() {
		// TODO Auto-generated method stub
		return uRepo.findAll();
	}

	@Override
	public UserDetails findUserDetailsById(int u_id) throws NoUserFoundException {
		// TODO Auto-generated method stub
		Optional<UserDetails> uFind = uRepo.findById(u_id);
		UserDetails user = null;
		if(uFind.isPresent()) {
			user = uFind.get();
		}
		else {
			throw new NoUserFoundException("User Not Found");
		}
		return user;
	}
	
	@Transactional
	@Override
	public UserDetails updateUserDetailsById(int u_id, UserDetails u) throws NoUserFoundException {
		// TODO Auto-generated method stub
		Optional<UserDetails> uFind = uRepo.findById(u_id);
		UserDetails user = null;
		if(uFind.isPresent()) {
			user = uFind.get();
			uRepo.save(u);
		}
		else {
			throw new NoUserFoundException("User Not Found");
		}
		return u;
	}

	@Override
	public UserDetails deleteUserDetailsById(int u_id) throws NoUserFoundException {
		// TODO Auto-generated method stub
		Optional<UserDetails> uFind = uRepo.findById(u_id);
		UserDetails user = null;
		if(uFind.isPresent()) {
			user = uFind.get();
			uRepo.delete(user);
		}
		else {
			throw new NoUserFoundException("User Not Found");
		}
		return null;
	}

//	@Override
//	public List<UserDetails> getApprovedlist() {
//		// TODO Auto-generated method stub
//		return uRepo.getapprovedList();
//	}

}
