package javpgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
				
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\LIB\\chromedriver_win32\\chromedriver.exe");
		
	}

}
