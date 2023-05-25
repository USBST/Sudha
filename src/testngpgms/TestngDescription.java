package testngpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestngDescription {
	WebDriver driver;
  @Test(description="searchbar")
  public void Search1() {
	  driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("news"+Keys.ENTER);
		 
	    }
  @Test(description="mainmenudownload",timeOut=3000)
  public void Search2() {
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
		 
	    }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
