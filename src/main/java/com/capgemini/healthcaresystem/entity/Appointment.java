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
@Table(name= "APPOINTMENT")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_seq")
	@SequenceGenerator(sequenceName = "appointment_seq", allocationSize = 1, name = "appointment_seq")
	@Column(name= "ID")
	private long id;
	
	
	
	@ManyToOne(optional=false)
	@JoinColumn(name= "TEST_ID")
	private Test test_id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name= "CENTRE_ID")
	private Centre centre_id;
	
	@Column(name= "DATE")
	private String date;
	
	@Column(name= "TIME")
	private String time;
	
	@Column(name= "APPROVAL_STATUS")
	private String approval_status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Test getTest_id() {
		return test_id;
	}

	public void setTest_id(Test test_id) {
		this.test_id = test_id;
	}

	public Centre getCentre_id() {
		return centre_id;
	}

	public void setCentre_id(Centre centre_id) {
		this.centre_id = centre_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getApproval_status() {
		return approval_status;
	}

	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}

}
