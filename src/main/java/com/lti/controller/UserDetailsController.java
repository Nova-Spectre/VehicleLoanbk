package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.UserDetails;
import com.lti.exception.NoUserFoundException;
import com.lti.service.UserService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/user")
	public List<UserDetails> getAllUserDetails(){
		return uService.listOfUserDetails();
	}
	@GetMapping("/user/{u_id}")
	public UserDetails getById(@PathVariable("u_id") int u_id) throws NoUserFoundException {
		return uService.findUserDetailsById(u_id);
	}
	@PostMapping("/user")
	public UserDetails addUserDetails(@RequestBody UserDetails u){
		return uService.createUserDetails(u);
	}
	
	@PutMapping("/user/{id}")
		public UserDetails modifyUserDetails(@PathVariable("id") int id,@RequestBody UserDetails u) throws NoUserFoundException {
		return uService.updateUserDetailsById(id, u);
	}
	@DeleteMapping("/user/{u_id}")
	public UserDetails removeUserDetails(@PathVariable("u_id") int u_id) throws NoUserFoundException {
		return uService.deleteUserDetailsById(u_id);
	}
	@GetMapping("/user/status/{status}")
	public List<UserDetails> getUserbyStatus(@PathVariable("status") String status){
		return uService.getApprovedlist(status);
	}
	
	@GetMapping("/user/countbyid/{u_id}")
	public long getCountbyuid(@PathVariable("u_id") int u_id){
		return uService.countByu_id(u_id);
	}
	
	@GetMapping("/user/countbyname/{uname}")
	public long getCountbyuname(@PathVariable("uname") String uname){
		return uService.countByName(uname);
	}
}
