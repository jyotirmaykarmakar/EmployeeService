package com.jyotirmay.project.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private String id;
	private String name;
	private String email;
	private String designation;
	private String contactno;
	private String password;
	
	public Employee() {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.contactno = contactno;
		this.password = password;
	}
	
	public Employee(String id, String name, String email, String designation, String contactno, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.contactno = contactno;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", designation=" + designation
				+ ", contactno=" + contactno + "]";
	}
	
	
	
	
	
}
