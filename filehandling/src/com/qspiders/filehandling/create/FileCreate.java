package com.qspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) {
//		File file=new File("sada.java");
//		try {
//			
//			if (file.exists()) {
//				System.out.println("file is already present....!!");
//			}
//			else {
//				file.createNewFile();
//				System.out.println("file is created....!!");
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File file=new File("aru.html");
		try {
			if (file.exists()) {
				System.out.println("file already present...");
			}
			else {
				file.createNewFile();
				System.out.println("file is created....!!");
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
