package com.sada.onlypracticeprogram.all;

public class ReverseWord {
	public static void main(String[] args) {
		String str="i am not a robot";
		String []str2=str.split(" ");
		String str3="";
		String str4="";
		
		for (int i = 0; i <str2.length; i++) {
			
			str4=str2[i];
			String str5="";
			for (int j =  str4.length()-1; j >=0; j--) {
				str5=str5+str4.charAt(j);
			}
			str3=str3+str5+" ";
		}
		System.out.println(str3);
	}

}
