package com.pathummadhusanka.levelup.generator;

import com.pathummadhusanka.levelup.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.model.Challenge;

public interface ChallengeGenerator {
	
	public Challenge generate(GenerateChallengeRequest request);
}
