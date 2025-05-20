package com.dkr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello world";
	}
}
