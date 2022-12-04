package org.institute.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class JobCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int jcNumber;
	private String customerName;
	private String v_No;
	
	@ManyToOne
	private Fault fid;
	
	@OneToOne
	private Mechanic mid;
	
	
	
	public Mechanic getMid() {
		return mid;
	}
	public void setMid(Mechanic mid) {
		this.mid = mid;
	}
	public Fault getFid() {
		return fid;
	}
	public void setFid(Fault fid) {
		this.fid = fid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJcNumber() {
		return jcNumber;
	}
	public void setJcNumber(int jcNumber) {
		this.jcNumber = jcNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getV_No() {
		return v_No;
	}
	public void setV_No(String v_No) {
		this.v_No = v_No;
	}
	
	
}
