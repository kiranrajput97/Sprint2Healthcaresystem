package com.capgemini.healthcaresystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.healthcaresystem.entity.Centre;

@Repository
public class CentreRepository implements CentreRepositoryInterface {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Centre centre) {
		// TODO Auto-generated method stub
		em.persist(centre);
		
	}

	@Override
	public List<Centre> reterive() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT centre FROM Centre centre";
		TypedQuery<Centre> query = em.createQuery(Qstr, Centre.class);
		return query.getResultList();
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		Centre centre = em.find(Centre.class, id);
		if(centre!=null)
			{
			em.remove(centre);
			return true;
			}
		return false;	
		}

}
