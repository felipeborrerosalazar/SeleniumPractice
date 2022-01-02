package com.company.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchWordPage {

	private static WebElement element = null;
	
	public static WebElement getSearchMenu(final WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(@class, \'c-searchbar__search-icon\')]"));
		return element;
	}
	
	public static WebElement getSearchWord(final WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class=\'c-searchbar__input js-searchbar__input\']"));
		return element;
	}
	
	public static WebElement getResult(final WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class=\'js-searchresult-resultset\']/div[1]"));
		return element;
	}
	
	public static WebElement getAcceptCookieButton(final WebDriver driver) {
		element = driver.findElement(By.id("onetrust-accept-btn-handler"));
		return element;
	}

}
