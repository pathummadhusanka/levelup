package com.pathummadhusanka.levelup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathummadhusanka.levelup.model.Challenge;
import com.pathummadhusanka.levelup.service.ChallengeService;


@RestController
@RequestMapping("/api")
public class ChallengeController {

	private final ChallengeService challengeService;

	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	@GetMapping("/challenge")
	public Challenge getChallenge() {
		return challengeService.readChallenge();
	}
}
