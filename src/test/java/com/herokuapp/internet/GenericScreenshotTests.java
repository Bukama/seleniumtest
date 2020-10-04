package com.herokuapp.internet;

import com.herokuapp.internet.po.LandingPagePO;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.SetSystemProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


@SetSystemProperty(key = "sel.jup.default.browser", value = "chrome")
@SetSystemProperty(key = "sel.jup.screenshot.at.the.end.of.tests", value = "true")
@SetSystemProperty(key = "sel.jup.screenshot.format", value = "png")
@SetSystemProperty(key = "sel.jup.output.folder", value = "./output/")
@ExtendWith(SeleniumJupiter.class)
public class GenericScreenshotTests {

	static final String URL = "http://the-internet.herokuapp.com/";

	@Test
	void screenshotTest(WebDriver driver) {

		driver.get(URL);

		var landingPage = new LandingPagePO(driver);

		assertThat(landingPage.title()).isEqualTo("The Internet");

		var inputsPagePO = landingPage.navigateToInputsPage();

		assertThat(inputsPagePO.title()).isEqualTo("Inputs");
	}

}
