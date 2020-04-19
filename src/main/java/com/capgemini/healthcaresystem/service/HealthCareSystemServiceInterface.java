package com.capgemini.healthcaresystem.service;

import java.util.List;

import com.capgemini.healthcaresystem.entity.Appointment;
import com.capgemini.healthcaresystem.entity.Centre;
import com.capgemini.healthcaresystem.entity.Test;


public interface HealthCareSystemServiceInterface {
	
	//Appointment
	public Appointment saveAppointment(Appointment a);

	public List<Appointment> reteriveAppointment();

	public Boolean deleteAppointment(int id);
	
	

	
	//Test
	public Test saveTest(Test t);

	public List<Test> reteriveTest();

	public Boolean deleteTest(int id);
	
	
	//Centre
	public Centre saveCentre(Centre c);

	public List<Centre> reteriveCentre();

	public Boolean deleteCentre(int id);

}
