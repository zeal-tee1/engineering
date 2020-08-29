package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aboutController {
	
	@RequestMapping(value="/aboutus")
	public String abt()
	{
		return "aboutus";
	}
	
	

}
