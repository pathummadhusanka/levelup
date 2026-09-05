package com.pathummadhusanka.levelup.dto;

import com.pathummadhusanka.levelup.enums.Difficulty;
import com.pathummadhusanka.levelup.enums.ProgrammingLanguage;

public class GenerateChallengeRequest {

	private ProgrammingLanguage language;
	private Difficulty difficulty;

	public ProgrammingLanguage getLanguage() {
		return language;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}
}
