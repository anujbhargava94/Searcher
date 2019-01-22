package com.anuj.projects.searcher.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApplicationController {

	private static String WELCOME = "Welcome to my Searcher Application";

	@RequestMapping("/home")
	public String welcome() {// Welcome page, non-rest
		return WELCOME;
	}

	@RequestMapping("/home/{name}")
	public String message(@PathVariable String name) {
		String msg = "Hello " + name;
		return msg;
	}
}
