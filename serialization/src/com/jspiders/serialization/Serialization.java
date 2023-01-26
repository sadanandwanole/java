package com.jspiders.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serialization.Create.Student;

public class Serialization {
	public static void main(String[] args) {
		File file=new File("student.txt");
		try {
			file.createNewFile();
			System.out.println("File is Created...!");
			Student student  = new Student();
			FileOutputStream fileOutputStream=new FileOutputStream("student.txt");
			student.setId(1);
			student.setName("sadanand");
			student.setEmail("sada@gmail.com");
			student.setAdredd("pune");
			student.setPhine("8080385196");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			System.out.println("Added Successfull.....!");
			objectOutputStream.close();
			System.out.println(student);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
