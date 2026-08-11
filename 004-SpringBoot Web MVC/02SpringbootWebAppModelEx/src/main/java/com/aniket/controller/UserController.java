package com.aniket.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aniket.bean.User;

@Controller
public class UserController {
   
	@RequestMapping(value="/info",method = RequestMethod.GET)
	public String showUserPage(Model model)
	{
		model.addAttribute("uname","ajay raj");
		model.addAttribute("cname","SBMS");
		return"UserHome";
	}
	
	@RequestMapping(value="/obj",method = RequestMethod.GET)
	public String showUserOb(Model model)
	{
		User user = new User(10,"Aniket..!","Caption");
		model.addAttribute("obj",user);
		
		List<User> list = Arrays.asList(
					
				new User(10,"AA","XZY"),
				new User(11,"BB","XZY"),
				new User(12,"CC","MNY"),
				new User(12,"DD","MNY")
				);
		
		model.addAttribute("Listobj",list);
		
		return "UserData";
		
		
	}
}
