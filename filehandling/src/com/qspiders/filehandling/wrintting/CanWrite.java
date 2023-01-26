package com.qspiders.filehandling.wrintting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CanWrite {
	public static void main(String[] args) {
//		File file=new File("sada_1.txt");
//		try {
//			if (file.exists()) {
//				System.out.println("File is Already present...!!");
//				
//			}
//			else {
//			file.createNewFile();
//			System.out.println("File Created Sussefull...!!!");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		
//		}
//		File file=new File("sada_1.txt");
//		if (file.exists()) {
//			file.delete();
//			System.out.println("File is deleted");
//		}
//		else {
//			System.out.println("File does not exists");
//		}
//		File file=new File("sada_2.txt");
//		if (file.exists()) {
//			System.out.println("File Is Present.....!!");
//		}
//		else {
//			try {
//				file.createNewFile();
//				System.out.println("File created Succesfull....!");
//				try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
//					fileOutputStream.write(45);
//					System.out.println("Data Added Succesfulll......!!!");
//					 fileOutputStream.close();
//					
//				}
//				 
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		File file=new File("sada_2.txt");
//		boolean b=file.canRead();
//		try {
//			FileInputStream fileInputStream=new FileInputStream(file);
//			int var=fileInputStream.read();
//			System.out.println(var);
//			System.out.println("Read Succesfully...!!!");
//			fileInputStream.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		File file=new File("sada_3.txt");
		if (file.exists()) {
			System.out.println("File already Exists...!!");
//			String var=file.getAbsolutePath();
			boolean var=file.canExecute();
			System.out.println(var);
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File Created.....!!");
				FileInputStream fileInputStream= new FileInputStream(file);
				String var=file.getAbsolutePath();
				System.out.println(var);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
