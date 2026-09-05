package com.pathummadhusanka.levelup.client;

import org.springframework.stereotype.Component;

import com.pathummadhusanka.levelup.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.model.Challenge;

@Component 
public class OpenRouterClient {
	
	public Challenge generateChallenge(
		GenerateChallengeRequest request
	) {

		// TODO: Call OpenRouter API
		
		return new Challenge(
			"Generated Challenge",
			"This is a test challenge generated through OpenRouter."
		);
	}
}
