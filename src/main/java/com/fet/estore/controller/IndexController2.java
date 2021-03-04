package com.fet.estore.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController2  {

	
	 @RequestMapping(value= {"/vm"} )
	  public String news(Model model){
		  ModelAndView modelAndView = new ModelAndView("news");
		  String hello = "Hello world";
		  model.addAttribute("hello", hello);
		 return "news";
	  }
	
}
