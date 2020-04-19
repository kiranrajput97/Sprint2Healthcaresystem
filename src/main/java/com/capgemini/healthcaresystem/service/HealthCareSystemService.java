package com.capgemini.healthcaresystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.healthcaresystem.entity.Appointment;
import com.capgemini.healthcaresystem.entity.Centre;
import com.capgemini.healthcaresystem.entity.Test;
import com.capgemini.healthcaresystem.repository.AppointmentRepositoryInterface;
import com.capgemini.healthcaresystem.repository.CentreRepositoryInterface;
import com.capgemini.healthcaresystem.repository.TestRepositoryInterface;


@Transactional
@Service
public class HealthCareSystemService implements HealthCareSystemServiceInterface{
	
	//Appointment
	@Autowired
	private AppointmentRepositoryInterface ari;
	
	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		ari.create(appointment);
		return appointment;
	}

	@Override
	public List<Appointment> reteriveAppointment() {
		// TODO Auto-generated method stub
		return ari.reterive();
	}

	@Override
	public Boolean deleteAppointment(int id) {
		// TODO Auto-generated method stub
		
		return ari.delete(id);
	}
	
	
	

	//Test
	@Autowired
	private TestRepositoryInterface tri;

	@Override
	public Test saveTest(Test test) {
		// TODO Auto-generated method stub
		tri.create(test);
		return test;	}

	@Override
	public List<Test> reteriveTest() {
		// TODO Auto-generated method stub
		return tri.reterive();
	}

	@Override
	public Boolean deleteTest(int id) {
		// TODO Auto-generated method stub
		return tri.delete(id);
	}

	
	
	//Centre
	@Autowired
	private CentreRepositoryInterface cri;
	
	@Override
	public Centre saveCentre(Centre centre) {
		// TODO Auto-generated method stub
		cri.create(centre);
		return centre;	}

	@Override
	public List<Centre> reteriveCentre() {
		// TODO Auto-generated method stub
		return cri.reterive();
	}

	@Override
	public Boolean deleteCentre(int id) {
		// TODO Auto-generated method stub
		return cri.delete(id);
 
	}

}
