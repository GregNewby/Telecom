/**
 * 
 */
package com.telecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Entity
@Table(name="plans")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double cost;
	private boolean validity;
	
	public Plan() {
	}

	public Plan(int id, String name, double cost, boolean validity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.validity = validity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isValidity() {
		return validity;
	}

	public void setValidity(boolean validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", cost=" + cost + ", validity=" + validity + "]";
	}
	

}
