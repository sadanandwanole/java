package com.sada.onlypracticeprogram.all;

public class ReverseStringLastWorlToFirst {

	public static void main(String[] args) {
		String str="i am not a robot";
		String str2[]=str.split(" ");
		String str3="";
		for (int i = str2.length-1; i >=0 ; i--) {
			str3=str3+str2[i]+" ";
			
		}
		
		
		System.out.println(str3+" ");
	}

}
