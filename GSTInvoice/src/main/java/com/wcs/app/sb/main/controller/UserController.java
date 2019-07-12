package com.wcs.app.sb.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class UserController {
	@RequestMapping("/")
	public String beforeLogin()
	{
		System.out.println("gstinvoice");
		return "GSTInvoice";
	}
}
