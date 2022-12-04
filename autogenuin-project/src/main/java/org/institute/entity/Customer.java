package org.institute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custInfo")
public class Customer {
	@Id
	private int id;
	
	private String CustVehicle;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCustVehicle() {
		return CustVehicle;
	}
	public void setCustVehicle(String custVehicle) {
		CustVehicle = custVehicle;
	}
	

}
