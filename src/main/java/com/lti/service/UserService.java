package com.lti.service;

import java.util.List;

import com.lti.entity.UserDetails;
import com.lti.exception.NoUserFoundException;

public interface UserService {

	public UserDetails createUserDetails(UserDetails u);

	public List<UserDetails> listOfUserDetails();

	public UserDetails findUserDetailsById(int u_id) throws NoUserFoundException;

	public UserDetails updateUserDetailsById(int u_id, UserDetails u) throws NoUserFoundException;

	public UserDetails deleteUserDetailsById(int u_id) throws NoUserFoundException;

	public List<UserDetails> getApprovedlist(String status);

	public long countByu_id(int u_id);

	public long countByName(String uname);

}
