package test_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
	
	public static void main(String[] args) {
		//System.setProperty("Webdriver.chrome.driver", "C:\\Sangam\\Driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		
		Login_Page l = new Login_Page();
		l.data(driver);
		Test1 t = new Test1();
		t.cls(driver);
		
		//driver.close();
	}
	
	public void data(WebDriver driver)
	{
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		
	}

}
