package com.practice.array;

import java.util.Scanner;

public class CharacterArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int b=scanner.nextInt();
		
		char []a=new char[] {'a','o','s','v','a'};
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("["+a[i]+", ");
		}
	}
	

}
