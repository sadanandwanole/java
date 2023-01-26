package com.practice.array;

import java.util.Scanner;

public class SingleArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int b=scanner.nextInt();
		int [] a=new int [b];
		
		System.out.println("Enter the Element of Arrays");
		
		
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Element Present in Arrays :");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
