package testngpgms;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Dropdownpgm {
	WebDriver driver;
	
  @Test
  public void dropDownsamples() throws Exception {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("500018");
	  Thread.sleep(5000);
	  /*new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByVisibleText("Australia");
	  Thread.sleep(5000);*/
	//  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("India");
	 // Thread.sleep(5000);
	//  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("IN");
	//  Thread.sleep(5000);
	  new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(14);
	  Thread.sleep(5000);
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
