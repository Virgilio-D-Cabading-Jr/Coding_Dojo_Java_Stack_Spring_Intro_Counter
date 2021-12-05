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
		if (session.getAttribute("count") == null) {	// if count is null, set count to zero
			counter.resetCount(session);
		}
		Integer count = counter.getCount(session);
		model.addAttribute("count", count);
		return "counter.jsp";
	}
	
	@GetMapping("/counter/addtwo")
	public String counterAddTwo(HttpSession session) {
		Counter counter = new Counter();
		counter.addNumberToCount(session, 2);
		return "redirect:/counter";
	}
	
	@GetMapping("/counter/reset")
	public String counterReset(HttpSession session) {
		Counter counter = new Counter();
		counter.resetCount(session);
		return "redirect:/counter";
	}
}