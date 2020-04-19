package com.capgemini.healthcaresystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.healthcaresystem.entity.Appointment;


@Repository
public class AppointmentRepository implements AppointmentRepositoryInterface{
	
	@PersistenceContext
	EntityManager em;

	
    @Override
	public void create(Appointment appointment) {
		// TODO Auto-generated method stub
    	em.persist(appointment);
		
	}

	@Override
	public List<Appointment> reterive() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT appointment FROM Appointment appointment";
		TypedQuery<Appointment> query = em.createQuery(Qstr, Appointment.class);
		return query.getResultList();
		
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		
		Appointment appointment = em.find(Appointment.class, id);
		if(appointment!=null)
			{
			em.remove(appointment);
			return true;
			}
		return false;
		
	}

}
