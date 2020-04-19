package com.capgemini.healthcaresystem.repository;

import java.util.List;

import com.capgemini.healthcaresystem.entity.Centre;

public interface CentreRepositoryInterface {
	
	public void create(Centre centre);

	public List<Centre> reterive();

	public Boolean delete(int id);

}
