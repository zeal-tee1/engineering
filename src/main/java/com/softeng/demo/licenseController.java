package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class licenseController {
	
	@RequestMapping(value="/license")
	public String rules()
	{
		return "license";
	}


}
