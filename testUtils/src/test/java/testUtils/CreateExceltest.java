package testUtils;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExceltest {

	public static void main(String arg[]) throws IOException {
		// TODO Auto-generated method stub

		String filepath = "C:\\Users\\KANNA\\eclipse-workspace\\testUtils\\src\\test\\resources\\testExce.xlsx";
		FileOutputStream op = new FileOutputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet();
		
		workbook.write(op);
		
		
		
	}
	
}
