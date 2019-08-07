package com.jyotirmay.project.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		//employeeRepository.findAll().forEach(employee::add);
		for(Employee employee:employeeRepository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployee(String id) {
		return employeeRepository.findById(id);
	}
	
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
	
	/*public Employee findByUsenameAndPassword(String id,String password) {
	
		return employeeRepository.findByUsenameAndPassword(id, password);
	}*/
}
