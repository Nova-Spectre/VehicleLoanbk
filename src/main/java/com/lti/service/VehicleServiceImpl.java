package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.VehicleRepository;
import com.lti.entity.Vehicle;
import com.lti.exception.NoVehicleFoundException;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	private VehicleRepository vRepo;

	@Override
	@Transactional
	public Vehicle createVehicledetails(Vehicle v) {
		// TODO Auto-generated method stub
		return vRepo.save(v);
	}

	@Override
	@Transactional
	public Vehicle findVehiclebyId(int vid) throws NoVehicleFoundException {
		// TODO Auto-generated method stub
		Optional<Vehicle> vfind = vRepo.findById(vid);
		Vehicle vehicle=null;
		if(vfind.isPresent()) {
			vehicle=vfind.get();
		
		}
		else
		{
			throw new NoVehicleFoundException("Vehicle Not Found");
		}
		return vehicle;
	}

	@Override
	public Vehicle updateVehiclebyId(int vid, Vehicle v) throws NoVehicleFoundException {
		// TODO Auto-generated method stub
		Optional<Vehicle> vfind = vRepo.findById(vid);
		Vehicle vehicle=null;
		if(vfind.isPresent()) {
			vehicle=vfind.get();
			vRepo.save(v);
		
		}
		else
		{
			throw new NoVehicleFoundException("Vehicle Not Found");
		}
		return v;
	}

	@Override
	public Vehicle deleteVehiclebyId(int vid) throws NoVehicleFoundException {
		// TODO Auto-generated method stub
		Optional<Vehicle> vfind = vRepo.findById(vid);
		Vehicle vehicle=null;
		if(vfind.isPresent()) {
			vehicle=vfind.get();
			vRepo.delete(vehicle);
		
		}
		else
		{
			throw new NoVehicleFoundException("Vehicle Not Found");
		}
		return vehicle;
	}

	@Override
	public List<Vehicle> allVehiclesList() {
		// TODO Auto-generated method stub
		return vRepo.findAll();
	}

}
