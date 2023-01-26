package com.qspiders.filehandling.deletefile;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file =new  File("sada.js");
		
		if (file.exists()) {
			file.delete();
			System.out.println("file is deleted....!!");
		} else {
			System.out.println("file is not found....!!");

		}
		
	}
	
}
