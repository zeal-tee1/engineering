package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cashController {
	
	@RequestMapping(value="/cash")
	public String money()
	{
		return "cash";
	}

}
