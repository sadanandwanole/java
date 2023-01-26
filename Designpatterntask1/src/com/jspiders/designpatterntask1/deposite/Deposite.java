package com.jspiders.designpatterntask1.deposite;

import com.jspiders.designpatterntask1.Account.Account;

public class Deposite {
	double depositeAmount;
	Account account;
	
	public void deposite(int depositeAmount) {
		System.out.println("Depositing "+depositeAmount+"Ruppes im the account");
		
		account.setAccountBallence(account.getAccountBallence() + depositeAmount);
		System.out.println("Available Ballence :"+account.getAccountBallence());
	}

}
