package com.practice.array;

import java.util.Scanner;

public class EvenNumberInArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int b=scanner.nextInt();
		int [] a=new int [b];
		
		
		System.out.println("Enter the element");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the "+ (i+1) + " element");
			a[i]=scanner.nextInt();
			

		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Evem muber are : " +a[i]);
			}
		}
	}

}
