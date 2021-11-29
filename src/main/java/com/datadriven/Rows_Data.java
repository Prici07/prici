package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rows_Data {
	public static void rd() throws Throwable {
		File f= new File ("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\data driven.xlsx");	
        FileInputStream fs= new FileInputStream(f);
        Workbook w= new XSSFWorkbook(fs);
        Sheet sheetAt = w.getSheetAt(0);
        Row row = sheetAt.getRow(3);
        int NumberOfCells = row.getPhysicalNumberOfCells();
        for (int i = 0; i < NumberOfCells; i++) {
        	Cell cell = row.getCell(i);
        	CellType cellType = cell.getCellType();
			
		if(cellType.equals(cellType.STRING)){
		String stringCellValue = cell.getStringCellValue();
	    System.out.println(stringCellValue);
		}
	    
	    else if (cellType.equals(cellType.NUMERIC)) {
	    	double numericCellValue = cell.getNumericCellValue();
	    	int value=(int) numericCellValue;
	    	System.out.println(value);
	    }}}
	
public static void main(String[] args) throws Throwable {
	rd();
}
        
	}
	


