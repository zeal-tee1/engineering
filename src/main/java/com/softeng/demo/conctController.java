package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class conctController {
	
	
	@RequestMapping(value="/contact")
	public String cont()
	{
		return "contact";
	}

}
