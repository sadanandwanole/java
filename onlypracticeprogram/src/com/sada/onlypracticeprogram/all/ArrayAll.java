package com.sada.onlypracticeprogram.all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ArrayAll {
	public static void main(String[] args) {
		
		
		String s="sadanand wanole";
		char c='0';
		char[] array = s.toCharArray();
		String s2="";
		for (int i = 0; i < array.length; i++) {
			if (s2.indexOf(array[i])==-1) {
				s2+=array[i];
			}
			
		}
		System.out.println(s2);
		
//		HashSet<Character> set=new HashSet<Character>();
//		for (int i = 0; i < array.length; i++) {
//			set.add(array[i]);
//		}
//		System.out.println(set);
//		int [] a= {10,20,30,40,30,20,80,60};
//		ArrayList<Integer> arrayList=new ArrayList<Integer>();
//		for (int i = 0; i < a.length; i++) {
//			arrayList.add(a[i]);
//		}
//		System.out.println(arrayList);
//		TreeSet<Integer> hashSet=new TreeSet<Integer>(arrayList);
//		System.out.println(hashSet);
//		NavigableSet<Integer> set = hashSet.descendingSet();
//		System.out.println(set);
	}

}
