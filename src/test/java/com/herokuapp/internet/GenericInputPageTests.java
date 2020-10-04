package com.herokuapp.internet;

import com.herokuapp.internet.po.LandingPagePO;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.SetSystemProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.assertj.core.api.Assertions.assertThat;

@SetSystemProperty(key = "sel.jup.default.browser", value = "chrome")
@ExtendWith(SeleniumJupiter.class)
public class GenericInputPageTests {

	static final String URL = "http://the-internet.herokuapp.com/";

	@Test
	void navigateToInputPageGeneric(WebDriver driver) {

		driver.get(URL);

		var landingPage = new LandingPagePO(driver);

		assertThat(landingPage.title()).isEqualTo("The Internet");

		var inputsPagePO = landingPage.navigateToInputsPage();

		assertThat(inputsPagePO.title()).isEqualTo("Inputs");
	}

}
