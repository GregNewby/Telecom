/**
 * 
 */
package com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.entity.CustomerCare;
import com.telecom.entity.Plan;
import com.telecom.repo.CustomerCareRepo;
import com.telecom.repo.PlanRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController
@RequestMapping("/api/customercare")
public class CustomerCareControler {

	@Autowired
	CustomerCareRepo customerCareRepo;
	
	@GetMapping("/getcustomercare")
	public List<CustomerCare> getCustomerCare(){
		return customerCareRepo.findAll();
	}
	
	@PostMapping("/addcustomercare")
	public CustomerCare addCustomerCare(@RequestBody CustomerCare customerCare) {
		return customerCareRepo.save(customerCare);
	}
	
	@DeleteMapping("/deletecustomercare/{id}")
	public String deleteCustomerCare(@PathVariable("id") int id) {
		try {
			customerCareRepo.deleteById(id);
			return "CUSTOMER CARE DELETED";
		} catch(Exception e) {
			return "CUSTOMER CARE NOT DELETED";
		}
	}

}
