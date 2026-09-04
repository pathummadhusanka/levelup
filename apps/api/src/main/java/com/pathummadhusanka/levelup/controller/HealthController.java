package com.pathummadhusanka.levelup.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
class HealthController {
	
	@GetMapping("/health")
	String getHealth() {
		return "LevelUp!";
	}
}