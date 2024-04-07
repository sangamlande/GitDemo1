package test_selenium;

import org.openqa.selenium.WebDriver;

public class Test1 {
	
	public void cls(WebDriver driver) {
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}

}
