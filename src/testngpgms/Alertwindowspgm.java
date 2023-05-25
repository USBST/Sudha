package testngpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alertwindowspgm {
	WebDriver driver;
	
  @Test(enabled=false)
  public void alertWindowsok() throws Exception {
	  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
  }
  @Test(enabled=false)
  public void alertkOrcancle() throws Exception {
	  driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
  }
  @Test(enabled=true)
  public void alertEntertextandokorcancle() throws Exception {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	 // driver.switchTo().alert().sendKeys("sudha");
	  Alert altr = driver.switchTo().alert();
	  altr.sendKeys("sudha");
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
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
