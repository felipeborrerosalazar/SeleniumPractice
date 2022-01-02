package com.company.sa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.company.sa.action.SearchWordAction;

public class SearchWordTestCase extends TestCase{
	
	@BeforeSuite
	public void setUp() {
		// go to www.allianz-assistance.es
		init("https://www.allianz-assistance.es/");
	}
	
	@Test
	public void searchWordTest() {
		final String preffix = "tarjeta de crédito";
		SearchWordAction searchWordAction = new SearchWordAction(driver);
		searchWordAction.acceptCokies();
		final String result = searchWordAction.searchWord("Seguro de Viaje");
		Assert.assertTrue(result.contains(preffix));
		System.out.println("Test Completed Successfully");
	}

}
