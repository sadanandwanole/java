package com.practice.array;

public class CountElement {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,11,23,12,32,11,11};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
