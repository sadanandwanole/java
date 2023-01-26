import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class StrinhAllProgram {
	public static void main(String[] args) {
		
		//reverse String
//		String name="YNOT";
//		char c='0';
//		String str="";
//		for (int i = 0; i <name.length(); i++) {
//			c=name.charAt(i);
//			str=c+str;
//		}
//		System.out.println(str);
		
		
		//Find Dublicate Character
		
//		String name="Sadanand";
//		char[] array = name.toCharArray();
//		
//		char c='0';
//		String str="";
//		int count=0;
//		for (int i = 0; i <array.length; i++) {
//			count=1;
//			for (int j = i+1; j < array.length; j++) {
//				if (array[i]==array[j]) {
//					count=count+1;
//					array[j]='0';
//				}
//			}
//			if (count>1 && array[i]!='0') {
//				System.out.println(array[i]);
//			}
//		}
		
		
//		String s="sadanand";
//		char []c=s.toLowerCase().toCharArray();
//		int count=0;
//		for (int i = 0; i < c.length; i++) {
//			count=1;
//			for (int j = i+1; j < c.length; j++) {
//				if (c[i]==c[j] && c[i] !='0') {
//					count= count+1;
//				}
//			}
//			
//				
//		}
//		
		//count the the dublicate character 
//		String s="sadanand wanole";
//		char []c=s.toLowerCase().toCharArray();
//		int count=0;
//		Map<Character, Integer>map=new TreeMap<>();
//		for (int i = 0; i < c.length; i++) {
//			count=0;
//			for (int j = 0; j < c.length; j++) {
//				if (c[i]==c[j]) {
//					count++;
//				}
//			}
//			map.put(c[i], count);
//		}
//		
//		System.out.println(map);
	
		
		//remove dublicate character
		
//		String s="sadanand wanole";
//		char []c=s.toLowerCase().toCharArray();
//		HashSet hashMap=new HashSet();
//		for (int i = 0; i < c.length; i++) {
//			hashMap.add(c);
//		}
//		System.out.println(hashMap);
		
//		String s="Sadanand wanole";
//		char[]c=s.toLowerCase().toCharArray();
//		String result="";
//		for (int i = 0; i < c.length; i++) {
//			if (result.indexOf(c[i])==-1) {
//				result+=c[i];
//			}
//		}
//		System.out.println(result);
		
		
		//String reverse word
//		
//		String s="i am not a robot";
//		String []str=s.split(" ");
//		String s2="";
//		
//		for (int i = str.length-1; i >=0 ; i--) {
//			s2+=str[i]+" ";
//		}
//		System.out.println(s2+" ");
		
		String name="sadanand datta wanole";
		String[] str=name.split(" ");
		String str2="";
		
		for (int i = str.length-1; i >=0 ; i--) {
			str2=str2+str[i]+" ";
		}
		
		System.out.println(str2);
		
		
//		String name="sadanand datta wanole";
//		String[] str=name.split(" ");
//		String result="";
//		for (int i = 0; i < str.length; i++) {
//			String str1=str[i];
//			String str2="";
//			
//			for (int j = str1.length()-1; j>=0 ; j--) {
//				str2=str2+str1.charAt(j);
//			}
//			result=result+str2+" ";
//		}
//		System.out.println(result+" ");
		
	}

}
