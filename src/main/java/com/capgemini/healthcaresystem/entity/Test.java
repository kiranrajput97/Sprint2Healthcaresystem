package com.capgemini.healthcaresystem.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "TEST")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_seq")
	@SequenceGenerator(sequenceName = "test_seq", allocationSize = 1, name = "test_seq")
	
	@Column(name= "ID")
	private long id;
	
	@Column(name= "NAME")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name= "CENTRE_ID")
	private Centre centre_id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
    public Centre getCentre_id() {
		return centre_id;
	}

	public void setCentre_id(Centre centre_id) {
		this.centre_id = centre_id;
	}

	public Test() {}
	
	public Test(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return "Test ->[ id = " + id+ "name = " + name + "]";
	}


}
