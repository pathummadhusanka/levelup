package com.pathummadhusanka.levelup.service;

import org.springframework.stereotype.Service;

import com.pathummadhusanka.dto.ChallengeResponse;
import com.pathummadhusanka.dto.GenerateChallengeRequest;
import com.pathummadhusanka.enums.Difficulty;
import com.pathummadhusanka.enums.ProgrammingLanguage;
import com.pathummadhusanka.levelup.model.Challenge;


@Service 
public class ChallengeService {
		
	public ChallengeResponse readChallenge(
		GenerateChallengeRequest request
	) {
		ProgrammingLanguage language = request.getLanguage();
		Difficulty difficulty = request.getDifficulty();

		// Generate Challenge
		Challenge challenge = new Challenge();

		if (request.getLanguage() == ProgrammingLanguage.PYTHON) {
			if (request.getDifficulty() == Difficulty.LOW) {
				challenge.setTitle("Easy Python");
				challenge.setDescription("How to print new lines in Python?");
			}
		} else {
			challenge.setTitle("Another Challenge");
			challenge.setDescription("How are you?");
		}
		
		ChallengeResponse response = new ChallengeResponse(
			challenge.getTitle(),
			challenge.getDescription()
		);

		return response;
	}
}
