package com.eaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

	@GetMapping("/message")
	public String message() {
		return "Spring Muli Modules";
	}

}
