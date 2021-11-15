package com.company.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchWordPage {

	private static WebElement element = null;
	
	public static WebElement getSearchMenu(final WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@class=\'masthead-actions-list-item\']//a[@href=\'#sections\']"));
		return element;
	}
	
	public static WebElement getSearchWord(final WebDriver driver) {
		element = driver.findElement(By.cssSelector("input#search-field-1"));
		return element;
	}
	
	public static WebElement getResult(final WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class=\'search-results-list\']/li[1]"));
		return element;
	}
	
	public static WebElement getAcceptCookieButton(final WebDriver driver) {
		element = driver.findElement(By.id("didomi-notice-agree-button"));
		return element;
	}

}
