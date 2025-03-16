package com.selenium.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	private static XSSFWorkbook workbook ;
	private static XSSFSheet firstSheet;

	public ExcelUtils(String excelLocation, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelLocation);
			firstSheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getnumberOfRowsforExcel();
//		getCellDataforString();
//		getCellDataforNumber();
	}

	public static int getnumberOfRowsforExcel(){
		int physicalNumberOfRows = firstSheet.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows"+physicalNumberOfRows);
		return physicalNumberOfRows;

	}
	public static int getnumberOfColumnsforExcel(){
		int numberOfColumns = firstSheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfRows"+numberOfColumns);
		return numberOfColumns;

	}


	public static String getCellDataforString(int rowNumber, int columnNumber){
		String stringCellValue = firstSheet.getRow(rowNumber).getCell(columnNumber).getStringCellValue();
//		System.out.println("________________"+stringCellValue);
		return stringCellValue;
	}
	


	public static double getCellDataforNumber(int rowNumber, int columnNumber){
		double numberCellValue = firstSheet.getRow(rowNumber).getCell(columnNumber).getNumericCellValue();
//		System.out.println("________________"+numberCellValue);
		return numberCellValue;
	}

}
