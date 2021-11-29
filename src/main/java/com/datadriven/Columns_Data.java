package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Columns_Data {
	public static void cd() throws Throwable {
	File f= new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\data driven.xlsx");
    FileInputStream fi = new FileInputStream(f);
    Workbook w= new XSSFWorkbook(fi);
    Sheet sheetAt = w.getSheetAt(0);
    int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
    System.out.println(physicalNumberOfRows);
    
    for (int i = 0; i < physicalNumberOfRows; i++) {
    	Row row = sheetAt.getRow(i);
    	
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(0);
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
		cd();
	}
}
	    
  

