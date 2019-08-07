package com.jyotirmay.project.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/all-user")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/find-user/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@GetMapping("/saveuser")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@GetMapping( value="/save-user/{id}")
	public void updateEmployee(@RequestBody String id, Employee employee) {
		employeeService.updateEmployee(id, employee);
	}
		
	@GetMapping("/delete-user/{id}")
	public void deleteEmployee(@RequestBody String id) {
		employeeService.deleteEmployee(id);
	}
	
	
}
