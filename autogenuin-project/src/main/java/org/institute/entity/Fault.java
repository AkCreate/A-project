package org.institute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "FaultInfo")
public class Fault {

	@Id
	private int id;
	
	private String faults;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFaults() {
		return faults;
	}

	public void setFaults(String faults) {
		this.faults = faults;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
