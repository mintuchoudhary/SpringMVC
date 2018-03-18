package com.spring.mvc.requestsession;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;

import com.spring.mvc.requestsession.HelloRequestScopeData;
import com.spring.mvc.requestsession.HelloSessionScopeData;


@Controller
public class HelloController {

	@Autowired
	private HelloRequestScopeData requestscopehellodata;

	@Autowired
	private HelloSessionScopeData sessionscopehellodata;

	@RequestMapping(value = "/hello")
	public String hellodata(Model model, HttpSession session) {
		model.addAttribute("requestscopedate", requestscopehellodata.getDate());
		System.out.println(sessionscopehellodata);
		model.addAttribute("sessionscopedate", sessionscopehellodata.getDate() + "with id:" + session.getId());
		model.addAttribute("sessionId",session.getId());
         System.out.println("session id:"+session.getId() + ":::"+RequestContextHolder.getRequestAttributes().getSessionId());
		// return to view "hello.jsp" 
		return "hello";
	}
}
