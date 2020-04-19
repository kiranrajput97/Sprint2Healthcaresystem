package com.capgemini.healthcaresystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.healthcaresystem.entity.Test;

@Repository
public class TestRepository implements TestRepositoryInterface {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Test test) {
		// TODO Auto-generated method stub
		em.persist(test);
		
	}

	@Override
	public List<Test> reterive() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT test FROM Test test";
		TypedQuery<Test> query = em.createQuery(Qstr, Test.class);
		return query.getResultList();	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		Test test = em.find(Test.class, id);
		if(test!=null)
			{
			em.remove(test);
			return true;
			}
		return false;
		}

}
