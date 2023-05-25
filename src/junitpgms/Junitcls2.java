package junitpgms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Junitcls2 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
			
	}
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
		
	}
	@Test
	void insta() {
		driver.get("https://www.instagram.com");
		
	}
	@Test
	void whtsapp() {
		driver.get("https://www.whatsapp.com");
		
	}

}
