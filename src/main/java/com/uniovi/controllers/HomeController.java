package com.uniovi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/" )
	public String index() {
		return "index";
	}
}
//https://bit.ly/38Vo1AH