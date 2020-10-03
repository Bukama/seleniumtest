package com.herokuapp.internet.enumerations;

public enum LandingPageNavigationTargets {

	INPUTS("Inputs");

	String linkLabel;

	LandingPageNavigationTargets(String linkLabel) {
		this.linkLabel = linkLabel;
	}

	public String getLinkLabel() {
		return linkLabel;
	}
}
