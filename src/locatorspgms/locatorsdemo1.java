package locatorspgms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class locatorsdemo1 {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	//	driver.quit();;
			}
@Disabled
	@Test
	void redmine1() throws Exception {
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("sudharani");
		Thread.sleep(3000);	
		driver.findElement(By.name("password")).sendKeys("Sudha123");
		Thread.sleep(3000);
		driver.findElement(By.name("autologin")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
			
	}

	@Test
	void redmine2() throws Exception {
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		//driver.findElement(By.className("login")).click();
		//WebElement elmnt1 = driver.findElement(By.className("login"));
		//elmnt1.click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.className("lost_password")).click();
	//	driver.findElement(By.id("mail")).sendKeys("sudharani.maddula@gmail.com");
	//	Thread.sleep(3000);
	//	driver.findElement(By.name("commit")).click();
	//	List<WebElement>totallinks = driver.findElements(By.tagName("a"));
	//	System.out.println(totallinks.size());
	//	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
}
}
