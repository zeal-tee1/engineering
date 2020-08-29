package com.softeng.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ordersController {
 
	@RequestMapping(value="/orders")
	public String odhaz()
	{
	return "orders";
}}
