package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
	@Query("SELECT u FROM UserDetails u WHERE u.status=?1")
	public List<UserDetails> getapprovedList(String status);
	
	@Query("SELECT COUNT(u) FROM UserDetails u WHERE u.u_id=?1")
	long countByu_id(int u_id);
	
	@Query("SELECT COUNT(u) FROM UserDetails u WHERE u.u_name=?1")
	long countByName(String uname);
	

	

	

}
