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
@Table(name= "CENTRE")
public class Centre {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "centre_seq")
	@SequenceGenerator(sequenceName = "centre_seq", allocationSize = 1, name = "centre_seq")
	@Column(name= "ID")
	private long id;
	
	@Column(name= "NAME")
	private String name;
	
	
	
	
	
	public Centre() {}
	
	
	public Centre(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
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

	
	public String toString()
	{
		return "Centre -> [id = " + id+ "name = " + name +"]";
	}

	
	
	
	
	

}
