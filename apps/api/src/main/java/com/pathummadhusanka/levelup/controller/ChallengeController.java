package com.pathummadhusanka.levelup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathummadhusanka.dto.ChallengeResponse;
import com.pathummadhusanka.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.model.Challenge;
import com.pathummadhusanka.levelup.service.ChallengeService;


@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {

	private final ChallengeService challengeService;

	public ChallengeController(ChallengeService challengeService) {
		this.challengeService = challengeService;
	}

	@PostMapping ("/generate")
	public ChallengeResponse getChallenge(
		@RequestBody GenerateChallengeRequest generateChallengeRequest
	) {
		return challengeService.readChallenge(generateChallengeRequest);
	}
}
