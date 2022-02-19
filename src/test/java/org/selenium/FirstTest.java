package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class FirstTest {
	
	@Test
	public void dummyTest() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\DriverExec\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://askomdch.com/");
		driver.getTitle();
		driver.quit();
	}

}
