package com.practice.array;

import java.util.HashSet;

public class DublicateHashset {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,4,4};
		int b[]=new int [a.length];
//		HashSet<Integer> hashSet=new HashSet<Integer>();
//		
//		for (int i = 0; i < a.length; i++) {
//			hashSet.add(a[i]);
//		}
//		System.out.println(hashSet);
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

}
