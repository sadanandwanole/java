package com.practice.array;

public class FirstDublicateElement {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,3,2,4,5,6,5,};
		
		int reapet=0;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j] && i !=j) {
					reapet =reapet+1;;
					System.out.println(a[j]);
					break;
				}
				
			}
			if (reapet > 0) {
				break;
			}
		}
	}

}
