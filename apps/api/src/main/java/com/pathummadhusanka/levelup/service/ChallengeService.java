package com.pathummadhusanka.levelup.service;

import org.springframework.stereotype.Service;

import com.pathummadhusanka.levelup.model.Challenge;


@Service 
public class ChallengeService {
		
	public Challenge readChallenge() {
		return new Challenge("Test Challenge!");
	}
}
