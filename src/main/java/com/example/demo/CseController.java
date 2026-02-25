package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "Created by 23MH1A05H3";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "ORGANISED BY 23MH1A05H3";
	}
}
