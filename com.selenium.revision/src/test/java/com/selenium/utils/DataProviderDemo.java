package com.selenium.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider(name = "testData")
	public Object testDataProvidingMethod() {
		return new Object[][] {{"Ram"},{"Sita"}, {"Lakshman"}};
	}
	
	@Test (dataProvider = "testData")
	public void testMethod(Object obj) {
		System.out.println("Printing from testcase for multiple testdata ********* :::" +obj);
	}

}
