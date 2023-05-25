package locatorspgms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Locatorsdemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	//	driver.quit();
	}
@Disabled
	@Test
	void idnameclascss() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("sudha");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("sudha@123");
		Thread.sleep(3000);
		driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.form-submit")).click();
}
	@Test
		void linktest() throws Exception {
			driver.get("http://hyderabadreport.com/user");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Vishleshana")).click();
			Thread.sleep(3000);			
		
}
}
