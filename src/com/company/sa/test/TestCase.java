package com.company.sa.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class TestCase {

	protected WebDriver driver;
	
	public void init(final String url) { 
	    System.setProperty
	    ("webdriver.chrome.driver","C:\\SQA\\Drivers\\chromedriver.exe"); 
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("start-maximized");
	    driver = new ChromeDriver(options);
	    //wait elements until are present
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get(url);
	 }
	@AfterSuite
	public void tearDown() {
		//close browser
		driver.close();
	 }
}
