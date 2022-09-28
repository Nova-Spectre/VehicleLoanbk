package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.entity.UserDetails;
import com.lti.entity.Vehicle;
import com.lti.exception.NoVehicleFoundException;
import com.lti.service.VehicleService;

@RestController
@CrossOrigin("http://localhost:4200")
public class VehicleController {
	@Autowired
	private VehicleService vser;
	
	@GetMapping("/Vehicle")
	public List<Vehicle> getallvehicles(){
		return vser.allVehiclesList();
	}
	
	@GetMapping("/Vehicle/{vid}")
	public Vehicle vehiclegetById(@PathVariable("vid")int vid) throws NoVehicleFoundException {
		return vser.findVehiclebyId(vid);
	}
	
	//
	
	
	@PostMapping("/Vehicle")
	public Vehicle createVehiclebyId(@RequestBody Vehicle v){
		return vser.createVehicledetails(v);
	}
	
	@PutMapping("/Vehicle/{vid}")
	public Vehicle ModifyVehiclebyId(@PathVariable("vid")int vid,@RequestBody Vehicle v) throws NoVehicleFoundException {
		return vser.updateVehiclebyId(vid, v);
	}
	
	@DeleteMapping("/Vehicle/{vid}")
	public Vehicle removeVehiclebyId(@PathVariable("vid")int vid) throws NoVehicleFoundException{
		return vser.deleteVehiclebyId(vid);
	}
	
//	@GetMapping("/vehicle/status/{status}")
//	public List<Vehicle> getVehiclebyStatus(@PathVariable("status") String status){
//		return vser.getvehiclestatus(status);
//	}
	
	
	

}
