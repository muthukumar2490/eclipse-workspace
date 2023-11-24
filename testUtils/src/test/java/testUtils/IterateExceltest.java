package testUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IterateExceltest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filepath = "C:\\Users\\KANNA\\eclipse-workspace\\testUtils\\src\\test\\resources\\testExcel.xlsx";
		FileInputStream ip = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(ip);

		for (org.apache.poi.ss.usermodel.Sheet sheet : workbook) {
			if((sheet.getSheetName()).equals("Sheet2")) {//prints only 3rd sheet
			for (Row row : sheet) {
				for (Cell cell : row) {
					System.out.print(cell.getStringCellValue() + " ");
				}
				System.out.println();
			}
		}}

	}

}
