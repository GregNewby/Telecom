/**
 * 
 */
package com.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.entity.CustomerCare;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Repository
public interface CustomerCareRepo extends JpaRepository<CustomerCare, Integer>{

}
