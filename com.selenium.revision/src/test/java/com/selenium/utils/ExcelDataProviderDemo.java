package com.selenium.utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderDemo {
	private static String projectPath = System.getProperty("user.dir");
	
//	public static void main(String[] args) {
//		ExcelDataProviderDemo obj = new ExcelDataProviderDemo();
//		obj.testData();
//	}
	@Test(dataProvider = "MyDataProvider")
	public void test1(String username, String password) {
		System.out.println(username + " | "+password);
		
	}
	
	@DataProvider(name ="MyDataProvider")
	private Object[][] getData(){
		Object[][] testData =  testData();
		return testData;
		
	}
	
	private Object[][] testData() {
		ExcelUtils excel = new ExcelUtils(projectPath+"/data/SaleData.xlsx","Sheet1");
		excel.getnumberOfRowsforExcel();
		
		int numberOfRowsforExcel = ExcelUtils.getnumberOfRowsforExcel();
		int numberOfColumnsforExcel = excel.getnumberOfColumnsforExcel();
		Object[][] testData = new Object[numberOfRowsforExcel-1][numberOfColumnsforExcel];
		for (int i = 1; i < numberOfRowsforExcel; i++) {
			for (int j = 0; j < numberOfColumnsforExcel; j++) {
				testData[i-1][j] = excel.getCellDataforString(i, j);
			}
		}
		
		return testData;
	}

}
