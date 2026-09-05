package com.pathummadhusanka.levelup.model;


public class Challenge {
	private String title;
	private String description;

	public Challenge() {
	}

	public Challenge(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
