package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class canzoOrderController {
	
	@RequestMapping(value="/canorder")
	public String canzo()
	{
		return "canorder";
	}

}
