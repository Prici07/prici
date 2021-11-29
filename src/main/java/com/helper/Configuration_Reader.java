package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\oct_maven_project_1\\src\\main\\java\\com\\properties\\config.properties");
		
		FileInputStream fs= new FileInputStream(f);
		
		p=new Properties();
		 
		p.load(fs);
		
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getEmail() {
		String email = p.getProperty("email");
      return email;

	}
	public String getPass() {
		String pass = p.getProperty("pass");
		return pass;

	}

}
