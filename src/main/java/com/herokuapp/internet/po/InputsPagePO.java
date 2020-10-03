package com.herokuapp.internet.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPagePO {

	WebDriver driver;

	By titleBy = By.tagName("h3");

	public InputsPagePO(WebDriver driver) {
		this.driver = driver;
	}

	public String title() {
		return driver.findElement(titleBy).getText();
	}
}
