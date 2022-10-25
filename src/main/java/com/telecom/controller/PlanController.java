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

import com.telecom.entity.Plan;
import com.telecom.repo.PlanRepo;

/**
 * @author Greg N.
 * @date :
 * 
 */
@RestController
@RequestMapping("/api/plan")
public class PlanController {

	@Autowired
	PlanRepo planRepo;
	
	@GetMapping("/getplan")
	public List<Plan> getPlan(){
		return planRepo.findAll();
	}
	
	@PostMapping("/addplan")
	public Plan addPlan(@RequestBody Plan plan) {
		return planRepo.save(plan);
	}
	
	@DeleteMapping("/deleteplan/{id}")
	public String deletePlan(@PathVariable("id") int planId) {
		try {
			planRepo.deleteById(planId);
			return "PLAN DELETED";
		} catch(Exception e) {
			return "PLAN NOT DELETED";
		}
	}

}
