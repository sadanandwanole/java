package com.practice.array;

import java.util.Scanner;

public class Array2DInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Size of Row");
		int c=scanner.nextInt();
		System.out.println("Enter the Size of Colomn");
		
		int d=scanner.nextInt();
		
		int a[][]=new int [c][d];
		
		//take the input
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element in i:");
			for (int j = 0; j < a.length; j++) {
				System.out.println("enter the element in j:");
				a[i][j]=scanner.nextInt();
				
			}
		}
		
		
		// printing the element present in array
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
