package com.example.demo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	serviceOfUser sep;
	@Autowired
	ServiceRpo rpe;
	@GetMapping("/register")
	public String home(Model mv)
	{	User user=new User();
		mv.addAttribute("user",user);
		return "show_form";
	}
	@PostMapping("/register")
	public String demo(@ModelAttribute("user") User user)
	{	
		if(sep.UserNameValidation(user.getName()))
			return "show_form";
		else {
			rpe.save(user);
		return "success";
		}
	}
	@GetMapping("/login")
	public String login(Model mv)
	{	User user=new User();
		mv.addAttribute("user",user);
		return "user_page";
	}
	@PostMapping("/login1")
	public String display(@ModelAttribute("user") User user)
	{
		if(sep.verfication(user.getName(), user.getPassword()))
		{			
			return "display";
		}
		else
			return "unsuccess";
		
	}
	@GetMapping("/listOfUser")
	public String  showlist(Model mv)
	{
		Iterable<User> list=rpe.findAll();
	
		mv.addAllAttributes((Collection<?>)list);
		
		
		return "listOfUser";
	}
	

}
