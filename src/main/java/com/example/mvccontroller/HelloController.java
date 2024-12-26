package com.example.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping(value="/helo")
	public ModelAndView getresult(ModelAndView mv) {
		mv.addObject("name","Bhanu Reddy");
		mv.setViewName("Result");
		return mv;
	}
	@GetMapping(value="/")
	public String getstatic() {
		return "static";
	}


}
