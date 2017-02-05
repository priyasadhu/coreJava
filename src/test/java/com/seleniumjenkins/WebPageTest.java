package com.seleniumjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebPageTest {
	
	@Test
	public void TitleTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("Title=" + title);
		System.out.println("URL is: " + driver.getCurrentUrl());
		System.out.println("Test Passed successfully");
		driver.close();
	}

}
