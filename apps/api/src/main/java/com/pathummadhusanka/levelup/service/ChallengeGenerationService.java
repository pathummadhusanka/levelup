package com.pathummadhusanka.levelup.service;

import org.springframework.stereotype.Service;

import com.pathummadhusanka.levelup.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.generator.ChallengeGenerator;
import com.pathummadhusanka.levelup.model.Challenge;

@Service 
public class ChallengeGenerationService {
	
	public final ChallengeGenerator challengeGenerator;

	public ChallengeGenerationService(ChallengeGenerator challengeGenerator) {
		this.challengeGenerator = challengeGenerator;
	}

	public Challenge generate(GenerateChallengeRequest request) {
		return challengeGenerator.generate(request);
	}
}
