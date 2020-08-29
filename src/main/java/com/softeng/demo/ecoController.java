package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ecoController {
	
	@RequestMapping(value="/ecocash")
	public String phone()
	{
		return "ecocash";
	}


}
