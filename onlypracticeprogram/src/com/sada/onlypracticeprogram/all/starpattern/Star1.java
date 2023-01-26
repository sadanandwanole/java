package com.sada.onlypracticeprogram.all.starpattern;

public class Star1 {
//	*                 
//	**
//	***
//	****
//	*****
	
	
//	1
//	22
//	333
//	4444
//	55555
	
	
//	1
//	12
//	123
//	1234
//	12345
	
//	2
//	34
//	456
//	5678
////	678910
//	public static void main(String[] args) {
//		int n=5;
//		for (int  i = 1; i <= n; i++) {
//			for (int j = 1; j<=i ; j++) {
//				System.out.print(n);
//			}
//			
//			System.out.println();
//			
//		}
//	}
	
	public static void main(String[] args) {
		//***** 12345       55555
		//****  1234		4444
		//***   123			333
		//**    12			22
		//*     1			1
		
//		int n=5;
//		for(int i=n;i>=1;i--) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//         *
		//        **
		//       ***
		//      ****
		//     *****
		
//		
//			*
//	       * *
//	      * * *
//	     * * * *
//	    * * * * *
		
//	int n=8;
//	for (int i = 1; i <= n; i++) {
//		for (int j = 1; j <=n-i; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 1; j <=i; j++) {
//			System.out.print(" *");
//		}
//		System.out.println();
//		
//	}
//		int n=5;
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
//		
//		for (int i = 1; i <=n; i++) {
//			for (int j =1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for (int j = n; j >= i; j--) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		
//		int n=5;
//		for (int i = n; i >=1; i--) {
//			for (int j = 1; j <=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int n=5;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(" ");
//				
//			}
//			for (int j = n; j >=i ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		//prime number
		
//		int n=14;
//		int count=0;
//		for (int i = 2; i < n-1; i++) {
//			if (n%i==0) {
//				count++;
//			}
//		}
//		if (count==0) {
//			System.out.println("ok");
//		}
//		else {
//			System.out.println("not ok");
//		}
		
		
//		palondro numer
//		int n=121;
//		int rev=0;
//		int rem=0;
//		while (n!=0) {
//			rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		System.out.println(rev);
		
	
		//strong number
		
		int a=145;
		int b=a;
		int c=0;
		int rem=0;
		int d=0;
		while (b>0) {
			rem=b%10;
			int fact=1;
			for (int i = 1; i <= rem; i++) {
				fact=fact*i;
			}
			b=b/10;
			c=c+fact;
			
		}
		if (a==c) {
			System.out.println("ok");
		}
				
		
	}

}
