package com.herokuapp.internet;

import com.herokuapp.internet.po.InputsPagePO;
import com.herokuapp.internet.po.LandingPagePO;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SeleniumJupiter.class)
public class InputPageTests {

	static final String URL = "http://the-internet.herokuapp.com/";

	@Test
	void navigateToInputPage(ChromeDriver driver) {

		driver.get(URL);

		var landingPage = new LandingPagePO(driver);

		assertThat(landingPage.title()).isEqualTo("The Internet");

		var inputsPagePO = landingPage.navigateToInputsPage();

		assertThat(inputsPagePO.title()).isEqualTo("Inputs");

	}

}
