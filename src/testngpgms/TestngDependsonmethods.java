package testngpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestngDependsonmethods {
	WebDriver driver;	
	
  @Test(dependsOnMethods="test2")
  public void test1() {
	  driver.findElement(By.name("q")).sendKeys("facebook"+Keys.ENTER);
	  
  }
  @Test
  public void test2() {
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	    }

}
