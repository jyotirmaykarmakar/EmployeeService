package com.jyotirmay.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.jyotirmay.project.employee.Employee;
import com.jyotirmay.project.employee.EmployeeService;


@Controller
public class EmpApiController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public String Home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "home";
	}
	
	@RequestMapping("/register")
	public String Registration(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_REGISTER");
		return "home";
	}
	
	@PostMapping("/save-user")
	public String registerEmployee(@ModelAttribute Employee employee, BindingResult bindingResult, HttpServletRequest request) {
		
		employeeService.addEmployee(employee);
		request.setAttribute("mode", "MODE_HOME");
		return "home";
	}
	
	
	@GetMapping("/show-users")
	public String showAllUser(HttpServletRequest request) {
		request.setAttribute("employees", employeeService.getAllEmployees());
		request.setAttribute("mode", "ALL_USERS");
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		
		request.setAttribute("mode","MODE_LOGIN");
		return "home";
	}
	
	//@RequestMapping("/login-user")
	/*public String loginUser(@ModelAttribute Employee employee,HttpServletRequest request) {
		
		if(employeeService.findByUsenameAndPassword(employee.getId(), employee.getPassword()!= null))
			return "home";
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "home";
		}
	}*/
	
}
