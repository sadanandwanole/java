package com.jspiders.serialization.desealization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serialization.Create.Student;

public class Desialization {
	public static void main(String[] args) {
		File file=new File("student.txt");
		boolean vale=file.canRead();
		System.out.println(vale);
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
			try {
				Student student=(Student)inputStream.readObject();
				System.out.println(student);
				inputStream.close();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	

}
