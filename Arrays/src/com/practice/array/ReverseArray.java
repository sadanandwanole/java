package com.practice.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Arrays Size : ");
		int b = scanner.nextInt();
		int[] a = new int[b];
		int temp = 0;

		for (int m = 0; m < a.length; m++) {
			a[m] = scanner.nextInt();
		}

		// print second greater

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ", ");
		}
	}

}
