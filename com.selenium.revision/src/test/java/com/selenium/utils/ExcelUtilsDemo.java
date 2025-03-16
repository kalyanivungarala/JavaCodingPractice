package com.selenium.utils;

public class ExcelUtilsDemo {
	private static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		System.out.println("Calling ExcelUtil from another class");
		ExcelUtils excelUtils = new ExcelUtils(projectPath+"/data/SaleData.xlsx","Sheet1");
		excelUtils.getnumberOfRowsforExcel();
		excelUtils.getCellDataforString(0, 0);
		excelUtils.getCellDataforNumber(1, 1);
	}

}
