package com.herokuapp.internet;

import com.herokuapp.internet.po.LandingPagePO;
import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junitpioneer.jupiter.SetSystemProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static io.github.bonigarcia.seljup.BrowserType.CHROME;
import static org.assertj.core.api.Assertions.assertThat;


@SetSystemProperty(key = "sel.jup.output.folder", value = "./output/")
@SetSystemProperty(key = "sel.jup.recording", value = "true")
@ExtendWith(SeleniumJupiter.class)
public class ScreenrecorderTests {

	static final String URL = "http://the-internet.herokuapp.com/";

	// https://bonigarcia.github.io/selenium-jupiter/#recordings-in-windows-or-mac
	@Disabled("No shared devices on windows")
	@Test
	void screenrecorderTest(@DockerBrowser(type = CHROME) RemoteWebDriver driver) {

		driver.get(URL);

		var landingPage = new LandingPagePO(driver);

		assertThat(landingPage.title()).isEqualTo("The Internet");

		var inputsPagePO = landingPage.navigateToInputsPage();

		assertThat(inputsPagePO.title()).isEqualTo("Inputs");
	}

}
