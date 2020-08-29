package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class swipController {
	
	@RequestMapping(value="/swip")
	public String mach()
	{
		return "swip";
	}


}
