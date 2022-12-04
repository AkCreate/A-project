package org.institute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="mechInfo")
public class Mechanic {
	
	@Id
	private int id;
	private String MechName;
	
	@ManyToOne
	private Customer cid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMechName() {
		return MechName;
	}

	public void setMechName(String mechName) {
		MechName = mechName;
	}

	public Customer getCid() {
		return cid;
	}

	public void setCid(Customer cid) {
		this.cid = cid;
	}
	
	
	
}
