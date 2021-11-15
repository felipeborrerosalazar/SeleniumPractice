package com.company.sa.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.company.sa.page.SearchWordPage;

public class SearchWordAction {

	WebDriver driver;
	String result;
	public SearchWordAction(WebDriver driver) {
		this.driver = driver;
	}
	
	public String searchWord(final String word) {
		//Click on Search Menu
		SearchWordPage.getSearchMenu(driver).click();
		//Enter the searched word and send INTRO
		SearchWordPage.getSearchWord(driver).sendKeys(word, Keys.RETURN);
		//Get the first coincidence of the results presented
		result = SearchWordPage.getResult(driver).getText();
		return result;
	}
	
	public void acceptCokies() {
		//Click on accept the cookies
		SearchWordPage.getAcceptCookieButton(driver).click();
	
	}
}
