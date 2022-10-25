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
@Table(name= "customer_care")
public class CustomerCare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String complaint;
	private int userId;
	private boolean status;
	
	public CustomerCare() {
		
	}

	public CustomerCare(int id, String complaint, int userId, boolean status) {
		super();
		this.id = id;
		this.complaint = complaint;
		this.userId = userId;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CustomerCare [id=" + id + ", complaint=" + complaint + ", userId=" + userId + ", status=" + status
				+ "]";
	}

}
