package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void data() throws Throwable {
	
	File f= new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\Excel");
	FileInputStream fs = new FileInputStream(f);
	Workbook w= new XSSFWorkbook(fs);
	Sheet createSheet = w.createSheet();
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow .createCell(0);
w.getSheet("name").getRow(0).createCell(1).setCellValue("password");
w.getSheet("prici").createRow(1).createCell(0).setCellValue("123");
w.getSheet("pavi").getRow(1).createCell(1).setCellValue("123@tu");
w.getSheet("latha").createRow(2).createCell(1).setCellValue("123");


	
} }
