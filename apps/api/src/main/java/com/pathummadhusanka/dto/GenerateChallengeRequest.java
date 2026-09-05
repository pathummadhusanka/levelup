package com.pathummadhusanka.dto;

import com.pathummadhusanka.enums.Difficulty;
import com.pathummadhusanka.enums.ProgrammingLanguage;

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
