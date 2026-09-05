package com.pathummadhusanka.dto;


public class ChallengeResponse {
	
	private String title;
	private String description;
	
	public ChallengeResponse(String title, String description) {
		this.title = title;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
}
