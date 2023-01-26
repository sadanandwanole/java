package com.practice.array;

import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int b=scanner.nextInt();
		int max=0;
		int []a=new int[b];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println("Maximum number in Arrays :"+max);
	}

}
