package com.vcabading.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.vcabading.counter.models.Counter;

/////////////////////////////////////////////////////////////////
//HOME CONTROLLER
/////////////////////////////////////////////////////////////////

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(HttpSession session, Model model) {
		Counter counter = new Counter();
		counter.addCount(session);
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Counter counter = new Counter();
		Integer count = counter.getCount(session);
		model.addAttribute("count", count);
		return "counter.jsp";
	}
}