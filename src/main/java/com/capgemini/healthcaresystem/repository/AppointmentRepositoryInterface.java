package com.capgemini.healthcaresystem.repository;

import java.util.List;

import com.capgemini.healthcaresystem.entity.Appointment;

public interface AppointmentRepositoryInterface {

	public void create(Appointment appointment);

	public List<Appointment> reterive();

	public Boolean delete(int id);
	

}
