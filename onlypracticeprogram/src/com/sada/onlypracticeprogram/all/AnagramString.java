package com.sada.onlypracticeprogram.all;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str="sada";
		String str2="das   a";
		str.replaceAll(" ", "");
		str2.replaceAll(" ","");
		if (str.length()==str2.length()) {
			char []c=str.toLowerCase().toCharArray();
			char []c2=str2.toLowerCase().toCharArray();
			Arrays.sort(c);
			Arrays.sort(c2);
			if (Arrays.equals(c2,c)) {
				System.out.println("ok");
			}
			else {
				System.out.println("not ok");
			}
		}
		else {
			System.out.println("not ok");
		}
	}

}
