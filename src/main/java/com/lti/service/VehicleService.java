package com.lti.service;

import java.util.List;

import com.lti.entity.Vehicle;
import com.lti.exception.NoVehicleFoundException;

public interface VehicleService {
	
	public Vehicle createVehicledetails(Vehicle v);
	public Vehicle findVehiclebyId(int vid) throws NoVehicleFoundException;
	public Vehicle updateVehiclebyId(int vid,Vehicle v) throws NoVehicleFoundException;
	public Vehicle deleteVehiclebyId(int vid) throws NoVehicleFoundException;
	public List<Vehicle> allVehiclesList();
//	public List<Vehicle> getvehiclestatus(String status);
	

}
