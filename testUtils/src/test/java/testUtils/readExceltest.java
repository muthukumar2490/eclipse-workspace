package testUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExceltest {

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		String filepath = "C:\\Users\\KANNA\\eclipse-workspace\\testUtils\\src\\test\\resources\\testExcel.xlsx";
//		FileInputStream ip = new FileInputStream(filepath);
//		XSSFWorkbook workbook = new XSSFWorkbook(ip);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		XSSFRow row = sheet.getRow(3);
//		XSSFCell cell = row.getCell(1);
//
//		System.out.println(cell.getStringCellValue());
//		
//		for(Row row1: sheet) {
//			for(Cell cell1: row1) {
//				System.out.print(cell1.getStringCellValue()+" ");
//			}
//			System.out.println(	);
//		}
//	}

//	9Nov2023
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\KANNA\\eclipse-workspace\\testUtils\\src\\test\\resources\\testExcel.xlsx";
		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (Row row : sheet) {
			for (Cell cell : row) {
				System.out.println(cell.getStringCellValue());
			}
		}

		Object[][] obj = new Object[sheet.getLastRowNum() + 1][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		for (int r = 0; r <= sheet.getLastRowNum(); r++) {
			for (int c = 0; c < sheet.getRow(0).getLastCellNum(); c++) {
				System.out.println(sheet.getRow(r).getCell(c));
				obj[r][c] = sheet.getRow(r).getCell(c);
			}

		}

	}

}
