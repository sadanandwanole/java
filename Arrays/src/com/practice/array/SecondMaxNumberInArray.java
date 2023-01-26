package com.practice.array;

import java.util.Scanner;

public class SecondMaxNumberInArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Arrays Size : ");
		int b=scanner.nextInt();
		int []a=new int [b];
		int temp=0;
		int i=0;
		int j=0;
		
		for ( int m = 0; m < a.length; m++) {
			a[m]=scanner.nextInt();
		}
		
		//print second greater
		
		for ( i = 0; i < a.length; i++) {
			for ( j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+" ");
		}
		
		
	}

}
