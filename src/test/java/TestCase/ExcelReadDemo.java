package TestCase;

import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path ="C:\\Users\\prajr\\SUryaTech Notes\\Freamework_TestData.xlsx";
		XSSFWorkbook workbook;
		FileInputStream fs= new FileInputStream(path);
		workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
	}

}
