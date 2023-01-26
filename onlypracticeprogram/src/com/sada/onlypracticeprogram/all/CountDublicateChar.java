package com.sada.onlypracticeprogram.all;
import java.util.*;
public class CountDublicateChar {
public static void main(String[] args) {
//	try (Scanner scanner = new Scanner(System.in)) {
//		String string=scanner.nextLine();
//		int count=0;
//		string=string.replace(" ", "");
//		char [] c= string.toCharArray() ;
//		Map<Character, Integer> map=new TreeMap <> ();
//		for (int i = 0; i < string.length(); i++) {
//			count=0;
//			for (int j = 0; j < string.length(); j++) {
//				if (c[i]==c[j]) {
//					count++;
//				}
//				
//			}
//			map.put(c[i], count);
//		}
//			System.out.println(map);
//	}
	String str="sadanand";
	str=str.replace(" ", "");
	char c[]=str.toCharArray();
	int count=0;
	Map<Character, Integer> map=new TreeMap <>();
	for (int i = 0; i < str.length(); i++) {
		count=0;
		for (int j = 0; j < str.length(); j++) {
			if (c[i]==c[j]) {
				count++;
			}
			map.put(c[i], count);
		}
	}
	System.out.println(map);
	}
}
