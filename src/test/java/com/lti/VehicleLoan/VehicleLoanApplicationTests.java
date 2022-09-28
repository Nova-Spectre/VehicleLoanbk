
package com.lti.VehicleLoan;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.LoanRepository;
import com.lti.dao.UserDetailsRepository;
import com.lti.dao.VehicleRepository;
import com.lti.entity.Loan;
import com.lti.entity.UserDetails;
import com.lti.entity.Vehicle;
import com.lti.exception.NoUserFoundException;
import com.lti.exception.NoVehicleFoundException;

@SpringBootTest
class VehicleLoanApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
/////////////////////////////User Test Case/////////////////////////////////
	@Autowired
	private UserDetailsRepository uRepo;
	
	@Test
	public void testcreate() {
		UserDetails u = new UserDetails();
		u.setU_id(13);
		u.setU_name("Shubham");
		u.setU_email("fddfd@hm.c");
		u.setMob_no(855161);
		u.setGender("male");
		u.setAge(24);
		u.setCity("mumbai");
		u.setPincode(452106);
		u.setAddress("abfdab jbbcabc s");
		u.setPassword("abcdef");
		u.setState("maharastra");
		uRepo.save(u);
		Assertions.assertNotNull(uRepo.findById(30).get());
		
	}
	
	@Test 
	public void testReadAll() {
		List<UserDetails> ufind = uRepo.findAll();
		Assertions.assertTrue(ufind.size() > 0);
	}
	
	
	@Test
	public void testUpdateUser() {
		UserDetails u = uRepo.findById(30).get();
		u.setPassword("43254553");
		uRepo.save(u);
		assertNotEquals("5235525", uRepo.findById(30).get().getPassword());
	}
	
	
	@Test
	public void testDeleteUser() throws NoUserFoundException {
		
		
	}
	
	////////////////////////Vehicle Test Case/////////////////////////////////////////
	@Autowired
	VehicleRepository vRepo;
	@Test
	public void vehiclecreate() {
		Vehicle v = new Vehicle();
		v.setVid(11);
		v.setVname("Hyundai");
		v.setShowroomprice(1500000);
		v.setOnroadprice(1800000);
		v.setAadharcardno(453258962);
		v.setPancardno("Fchpp5278A");
		v.setPhoto(true);
		v.setEmploymenttypes("salaried");
		v.setSalaryslip(true);
		v.setAnnualsalary(4500000);
		v.setExistingemi(false);
		vRepo.save(v);
		Assertions.assertNotNull(vRepo.findById(31).get());
	}
	@Test
	public void VehicletestReadAll() {
		List<Vehicle> vfind = vRepo.findAll();
		Assertions.assertTrue(vfind.size() > 0);
	}
	@Test
	public void testUpdateVehicle() {
		Vehicle v = new Vehicle();
		v.setVid(12);
		v.setVname("Tata Safari");
		v.setShowroomprice(2500000);
		v.setOnroadprice(2800000);
		v.setAadharcardno(798898799);
		v.setPancardno("EJR23425");
		v.setPhoto(true);
		v.setEmploymenttypes("salaried");
		v.setSalaryslip(true);
		v.setAnnualsalary(4000000);
		v.setExistingemi(false);
		vRepo.save(v);
		Assertions.assertNotNull(vRepo.findById(31).get());
	}
	@Test
	public void testDeleteVehicle() throws NoVehicleFoundException {
	
	}
	
	
	/////////////////////////Loan Create/////////////////////////////////
	@Autowired
	LoanRepository lRepo;
	@Test
	public void Loancreate() {
		Loan l = new Loan();
		l.setAcctype("salary");
		l.setAmount(200000);
		l.setEmi(3000);
		l.setLoanno(35);
		l.setRate("2.5");
		l.setTenuremonths(12);
		lRepo.save(l);
		Assertions.assertNotNull(lRepo.findById(35).get());		
	}
	@Test
	public void LoantestReadAll() {
		List<Loan> lfind = lRepo.findAll();
		Assertions.assertTrue(lfind.size() > 0);
	}
	@Test
	public void testUpdateLoan() {
		Loan l = lRepo.findById(35).get();
		l.setRate("2.5");
		lRepo.save(l);
		assertNotEquals("3.5", lRepo.findById(35).get().getRate());
	}
	@Test
	public void testDeleteLoan() {
		
	}
}
