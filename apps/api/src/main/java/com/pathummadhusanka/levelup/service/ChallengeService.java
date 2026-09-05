package com.pathummadhusanka.levelup.service;

import org.springframework.stereotype.Service;

import com.pathummadhusanka.levelup.dto.ChallengeResponse;
import com.pathummadhusanka.levelup.dto.GenerateChallengeRequest;
import com.pathummadhusanka.levelup.enums.Difficulty;
import com.pathummadhusanka.levelup.enums.ProgrammingLanguage;
import com.pathummadhusanka.levelup.model.Challenge;


@Service 
public class ChallengeService {

	private final ChallengeGenerationService generationService;

	public ChallengeService(ChallengeGenerationService generationService) {
		this.generationService = generationService;
	}
		
	public ChallengeResponse readChallenge(
		GenerateChallengeRequest request
	) {
		ProgrammingLanguage language = request.getLanguage();
		Difficulty difficulty = request.getDifficulty();

		// Generate Challenge

		// Challenge challenge = new Challenge();
		// if (request.getLanguage() == ProgrammingLanguage.PYTHON) {
		// 	if (request.getDifficulty() == Difficulty.LOW) {
		// 		challenge.setTitle("Easy Python");
		// 		challenge.setDescription("How to print new lines in Python?");
		// 	}
		// } else {
		// 	challenge.setTitle("Another Challenge");
		// 	challenge.setDescription("How are you?");
		// }

		Challenge challenge = generationService.generate(request);

		ChallengeResponse response = new ChallengeResponse(
				challenge.getTitle(),
				challenge.getDescription());

		return response;
	}
}
