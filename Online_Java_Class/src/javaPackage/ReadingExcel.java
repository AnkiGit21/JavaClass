package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		// Specify the location of Excel file
		File src = new File("C:\\Users\\Admin\\Downloads\\Training Materials\\Short Notes.xlsx");
		
		// Load the excel file
		FileInputStream fis = new FileInputStream(src);
		
		// Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		// Print the loaded sheet name
		System.out.println(sh.getSheetName());
		

	}

}
