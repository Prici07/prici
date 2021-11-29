package com.np;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lp {
	
    	public static void row_Data() throws Throwable {
		System.out.println("No of Rows");
		File fl =new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel\\data driven.xlsx");
		FileInputStream f= new FileInputStream(fl);
		Workbook w= new XSSFWorkbook(f);
		Sheet sheetAt = w.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			
			//int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			//for (int j = 0; j < physicalNumberOfCells; j++) {
			//Cell cell = row.getCell(j);			
			
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
		    
		    if(cellType.equals(cellType.STRING)){
		    String stringCellValue = cell.getStringCellValue();
		    System.out.println(stringCellValue);}
		    
		    else if(cellType.equals(cellType.NUMERIC)) {
		    	double numericCellValue = cell.getNumericCellValue();   
		    	int value=(int)numericCellValue;
		    	System.out.println(value);
		    }
		}}

public static void main(String[] args) throws Throwable {
	row_Data();
}}


    	
    	