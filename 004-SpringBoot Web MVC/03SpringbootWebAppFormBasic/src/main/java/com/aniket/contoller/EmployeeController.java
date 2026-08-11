package com.aniket.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aniket.bean.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	
	@GetMapping("/show")
	public String showForm() {
		return "EmpRegister";
	}
	
	@PostMapping("/register")
	public String readData(
			@ModelAttribute Employee employee,
			Model model
			) 
	{
		System.out.println(employee);
		model.addAttribute("obj",employee);
		return "EmpData";
	}
}
