package com.helper;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		// to restrict to create obj in ormal class
	}
	public  static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager fm= new File_Reader_Manager();
        return fm;
	}

	public Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader cr= new Configuration_Reader();
		return cr;

	}
}
