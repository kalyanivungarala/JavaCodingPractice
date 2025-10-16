import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exxcel {
	
	public static void main(String[] args) {
		XSSFWorkbook workbook = new XSSFWorkbook("");
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		sheet.getRow(1).getCell(1);
	
		
		
	}

}
