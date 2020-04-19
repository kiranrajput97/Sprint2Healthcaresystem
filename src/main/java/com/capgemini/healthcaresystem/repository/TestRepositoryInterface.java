package com.capgemini.healthcaresystem.repository;

import java.util.List;

import com.capgemini.healthcaresystem.entity.Test;

public interface TestRepositoryInterface {
	
	public void create(Test test);

	public List<Test> reterive();

	public Boolean delete(int id);

}
