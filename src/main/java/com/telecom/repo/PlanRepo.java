/**
 * 
 */
package com.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.entity.Plan;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
