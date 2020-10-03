package com.herokuapp.internet.po;

import com.herokuapp.internet.enumerations.LandingPageNavigationTargets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePO {

	WebDriver driver;

	By linkInputsBy = By.linkText(LandingPageNavigationTargets.INPUTS.getLinkLabel());

	public LandingPagePO(WebDriver driver) {
		this.driver = driver;
	}

	public InputsPagePO navigateToInputsPage() {
		WebElement inputsLink = driver.findElement(linkInputsBy);

		inputsLink.click();

		return new InputsPagePO(driver);
	}

	public String title() {
		return driver.getTitle();
	}
}
