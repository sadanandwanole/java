package com.jspiders.designpatterntask1.main;

import com.jspiders.designpatterntask1.Account.Account;
import com.jspiders.designpatterntask1.Withdraw.Withdraw;
import com.jspiders.designpatterntask1.deposite.Deposite;

public class Task1Main {
	public static void main(String[] args) {
		Account account=new Account(10000);
		System.out.println();
		account = null;
		if (account==null ) {
			account=new Account(10000);
		}
		
		Withdraw withdraw=new Withdraw();
		Deposite deposite=new Deposite();
		
		withdraw.withdraw(2000);
		
		
		
	}

}
