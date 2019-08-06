package com.jyotirmay.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyotirmay.project.employee.Employee;
import com.jyotirmay.project.employee.EmployeeService;


@Controller
public class EmpApiController {

	
	private EmployeeService employeeService;

	@RequestMapping("/home")
	public String Home(HttpServletRequest request) {
		return "home";
	}
	
	/*@PostMapping("/register")
	public String registerUser(@ModelAttribute Employee employee, BindingResult bindingResult, HttpServletRequest request) {
		
		employeeService.addEmployee(employee);
		request.setAttribute("mode", "MODE_HOME");
		return "home";
	}*/
	
	
}
