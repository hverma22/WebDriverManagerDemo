package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("84.0.4147.30").setup();
		//driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//driver= new FirefoxDriver();
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
	}

	@Test
	public void webDriverManagerTest() {
		
		driver.get("https://www.automationtestinginsider.com/");
		String titleString =driver.getTitle();
		System.out.println("Page Title is: "+titleString);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

