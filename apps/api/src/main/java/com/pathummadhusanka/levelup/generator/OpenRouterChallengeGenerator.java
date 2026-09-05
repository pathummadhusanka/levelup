package com.pathummadhusanka.levelup.generator;

import org.springframework.stereotype.Service;

import com.pathummadhusanka.levelup.client.OpenRouterClient;
import com.pathummadhusanka.levelup.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.model.Challenge;

@Service 
public class OpenRouterChallengeGenerator implements ChallengeGenerator{
	private final OpenRouterClient openRouterClient;

	public OpenRouterChallengeGenerator(OpenRouterClient openRouterClient) {
		this.openRouterClient = openRouterClient;
	}

	@Override
	public Challenge generate(GenerateChallengeRequest request) {
		return openRouterClient.generateChallenge(request);
	}
}
