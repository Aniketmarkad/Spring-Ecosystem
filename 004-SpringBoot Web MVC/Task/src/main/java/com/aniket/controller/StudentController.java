package com.aniket.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aniket.entity.StudentEntity;
import com.aniket.exception.StudentNotFoundException;
import com.aniket.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;

	@GetMapping("/register")
	public String showPage (Model model)
	{
		model.addAttribute("Msg","WELCOME TO REGISTERATION  PAGE");
		return "StudentRegister";	
	}
	
	@PostMapping("/save")
	public String saveData(@ModelAttribute StudentEntity student,Model model)
	{
		Integer id = service.saveStudent( student);
		
		 model.addAttribute("Msg", "Student Saved Successfully. ID = " + id);

		    return "StudentRegister";
		
	}
	
	@GetMapping("/all")
	public String showData(Model model,
						   @RequestParam(value="message",required=false) String message
			)
	{
		List<StudentEntity> list= service.getAllStudents();
		model.addAttribute("list",list);
		model.addAttribute("message",message);
		return "StudentData";
	}
	
	
	@GetMapping("/delete")
	public String deleteData(@RequestParam("id") Integer Sid,
							RedirectAttributes attributes
			)
	{
		String msg = null;
		
		try {
			service.deleteStudent(Sid);
			msg =" Student " +Sid+ " deleted ";
		} catch(StudentNotFoundException e)
		{
			e.printStackTrace();
			msg=e.getMessage();
		}
		
		attributes.addAttribute("message",msg);
		return "redirect:all";  
	}
	
	@GetMapping("/edit")
	public String showEdit(@RequestParam("id")Integer Sid,
							Model model,
							RedirectAttributes attributes
			)
	{   
		
		String page = null;
		try {
			StudentEntity student = service.getOneStudent(Sid);
			model.addAttribute("student",student);
			page = "StudentEdit";
			
		} catch(StudentNotFoundException e)
		{
			e.printStackTrace();
			attributes.addAttribute("message",e.getMessage());
			page="redirect:all";
		}
		
		return page;
	}
	
	//6.upadate form data and submit
	@PostMapping("/update")
	public String updateData( @ModelAttribute StudentEntity student,
							RedirectAttributes attributes
				) 
	{
		service.updateStudent(student);
		attributes.addAttribute("message","student " +student.getSid()+" updated!");
		return "redirect:all";
	}
	
	
	
}

