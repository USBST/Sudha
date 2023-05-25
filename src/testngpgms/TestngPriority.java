package testngpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestngPriority {
	WebDriver driver;
  @Test(priority=0,enabled=true)
  public void gmail() {
	  driver.get("https://www.gmail.com");
	    }
  @Test(priority=2,enabled=false)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(priority=1)
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test(priority=3)
  public void instagram() {
	  driver.get("https://www.instagram.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
