package com.sada.onlypracticeprogram.all;

public class FirstNonReapetedChar {
	public static void main(String[] args) {
		boolean s=true;
		String str="zzssadanandwanole";
//		str=str.replaceAll("\\s","");
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 0; j < str.length(); j++) {
				if (i!=j && str.charAt(i)==str.charAt(j)) {
					s=false;
				}
				
			
		}
			if (s) {
				System.out.println(str.charAt(i));
				break;
		}
	}

	}
}
