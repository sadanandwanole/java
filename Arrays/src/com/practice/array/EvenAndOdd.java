package com.practice.array;

import java.util.Iterator;

public class EvenAndOdd {
	public static void main(String[] args) {
		
		int []s= {1,2,3,4,5,6,7,8,9,10};
		int []a1=new int [s.length];
		int []b=new int [s.length];
		
		
		for (int i = 0; i < s.length; i++) {
				if (s[i]%2==0) {
					a1[i]=s[i];
					
				} else {
					b[i]=s[i];

				}
			}
		for (int i = 0; i < b.length; i++) {
			if (b[i] !=0) {
				System.out.println(b[i]);
			}
		}
		}
	}

