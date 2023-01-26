
package com.sada.onlypracticeprogram.all;

public class RemoveDublicateCharacter {
	public static void main(String[] args) {
		String str="sadanand wanole";
		String str2="";
		char c='0';
		for (int i = 0; i < str.length(); i++) {
			c=str.charAt(i);
			if (str2.indexOf(c)==-1) {
				str2 +=c;
		}
		
		}
		System.out.println(str2);
//		String str="aaaaaaaaaaaaaaabbbbbbbbbbbaaaaaaaaaaaaaaacccccccccccaaaaaa";
//		String str2="";
//		char c='0';
//		for (int i = 0; i < str.length(); i++) {
//			c=str.charAt(i);
//			if (str2.indexOf(c)==-1) {
//				str2+=c;
//			}
//		}
//		System.out.println(str2);
		
//		System.out.println("Enter Your Number");
//		Scanner scanner=new Scanner(System.in);
//		String string=scanner.nextLine();
//		char c='0';
//		String string2="";
//		for (int i = 0; i <string.length(); i++) {
//			c=string.charAt(i);
//			if (string2.indexOf(c)==-1) {
//				string2 +=c;
//			}
//			
//		}
//		System.out.println(string2);
	}

}
