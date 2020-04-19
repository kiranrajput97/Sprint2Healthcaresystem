package com.capgemini.healthcaresystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.healthcaresystem.entity.Appointment;

import com.capgemini.healthcaresystem.exception.AppointmentException;
import com.capgemini.healthcaresystem.service.HealthCareSystemServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HealthCareSystemController {

	@Autowired
	private HealthCareSystemServiceInterface serviceinterfaceObject;
	
	
	//Appointment Controller
	
	@PostMapping("/appointment")
	public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment) {

		Appointment ap = serviceinterfaceObject.saveAppointment(appointment);

		return new ResponseEntity<Appointment>(ap, HttpStatus.OK);
	}
	
	@GetMapping("/getAppointment")
	public ResponseEntity<List<Appointment>> getAllAppointment() {
		List<Appointment> lap = serviceinterfaceObject.reteriveAppointment();
		return new ResponseEntity<List<Appointment>>(lap, HttpStatus.OK);
	}
	
	@GetMapping("/BookAppointment")
	public ResponseEntity<List<Appointment>> BookAllAppointment() {
		List<Appointment> lap = serviceinterfaceObject.reteriveAppointment();
		return new ResponseEntity<List<Appointment>>(lap, HttpStatus.OK);
	}
	
	
}