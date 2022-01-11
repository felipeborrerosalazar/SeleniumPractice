package com.company.sa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.company.sa.action.SearchWordAction;

public class SearchWordTestCase extends TestCase{
	
	@BeforeSuite
	public void setUp() {
		// go to www.genbeta.com
		init("https://www.genbeta.com");
	}
	
	@Test
	public void searchWordTest() {
		final String preffix = "Ni Google Ni Facebook";
		SearchWordAction searchWordAction = new SearchWordAction(driver);
		searchWordAction.acceptCokies();
		final String result = searchWordAction.searchWord("metaverso");
		Assert.assertTrue(result.startsWith(preffix));
		System.out.println("Test Completed Successfully");
	}

}
