package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
//	@Query(name="SELECT u FROM UserDetails u WHERE u.status=0")
//	public List<UserDetails> getapprovedList();


}
