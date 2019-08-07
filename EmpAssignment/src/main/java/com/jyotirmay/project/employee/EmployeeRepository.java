package com.jyotirmay.project.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String>{
	
	//public Employee findByUsenameAndPassword(String id, String Password);

}
