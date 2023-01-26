package com.jspiders.designpatterntask1.Withdraw;

import com.jspiders.designpatterntask1.Account.Account;

public class Withdraw {
	public int withdrawAmount;
	Account account;
	
	public void withdraw(int withdrawAmount) {
		try {
			if (Account.getAccountBallence()>=withdrawAmount) {
				
			
			System.out.println("withdrawing "+withdrawAmount+"Ruppes im the account");
			
			
			account.setAccountBallence(account.getAccountBallence() + withdrawAmount);
			System.out.println("Available Ballence :"+account.getAccountBallence());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
