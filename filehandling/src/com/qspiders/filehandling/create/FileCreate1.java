package com.qspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate1 {
	public static void main(String[] args) throws IOException {
		File file=new File("text.java");
		if (file.exists()) {
			file.delete();
			System.out.println("File Deleted Succesfull..!!");
		}
		else {
		System.out.println("File not found..!!");
		}
	
}
}
