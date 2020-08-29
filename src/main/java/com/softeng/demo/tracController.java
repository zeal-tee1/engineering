package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tracController {
	
	@RequestMapping(value="/tracker")
	public String deli()
	{
		return "tracker";
	}

}
