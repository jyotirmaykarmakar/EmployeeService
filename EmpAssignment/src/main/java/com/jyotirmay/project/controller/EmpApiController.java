package com.jyotirmay.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmpApiController {


	@RequestMapping
	public String Home() {
		return "home";
	}
}
