package com.spring.mvc.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping(value= "/add" ,method = RequestMethod.GET)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in controller....");
		String name = request.getParameter("firstname");
		System.out.println("name:"+name);
	
		ModelAndView mv= new ModelAndView(); //can pass jsp name when defining object or by using setViewname()
		mv.setViewName("display"); // InternalResourceViewResolver tried to look for display.jsp page
		mv.addObject("result",name);
		
		//return "display";  //To call page directly
		return mv;
	}
 
	  @RequestMapping(value = "/register",method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		  System.out.println("in controller....");
	    ModelAndView mav = new ModelAndView("hello");	    
		 
		return mav;
	  } 
 
	  @RequestMapping(value = "/welcome",method = RequestMethod.GET)
	  public String printWelcome(ModelMap map) {
		  System.out.println("in controller....welcome");
	    map.addAttribute("result","Welcome from rest api...");	    
		 
		return "display";
	  } 
}
