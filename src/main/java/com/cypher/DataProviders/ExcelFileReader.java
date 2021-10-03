package com.cypher.DataProviders;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {

	public static Object[][] readDataFromExcel(String filePath)
	{
		File file;
		FileInputStream fileInputStream;
		XSSFWorkbook workbook;
		Object data[][] = null;
		try {
			file = new File(filePath);	
			fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowN = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			int colN = sheet.getRow(0).getLastCellNum();
			data = new Object[rowN - 1][colN];
			int r = 1, c = 0;
			System.out.println(rowN);
			while(r<rowN) {
				c = 0;
				while(c<colN) {
					System.out.println(r + " " + c);
					data[r - 1][c] = getCellData(sheet.getRow(r).getCell(c));
					c += 1;
				}
				r += 1;
			}
			workbook.close();
			
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
		return data;
		
	}
	
	public static String getCellData(Cell cell) {
		if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
			return String.valueOf((int)cell.getNumericCellValue());
		}
		else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		}
		return "";
	}
}
