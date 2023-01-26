package com.jspiders.designpatterntask1.Account;

public class Account {
	  private static double accountBallence;

	public Account(double accountBallence) {
		super();
		this.setAccountBallence(accountBallence);
	}

	public static double getAccountBallence() {
		try {
			return accountBallence;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountBallence;
	}

	public void setAccountBallence(double accountBallence) {
		this.accountBallence = accountBallence;
	}
	 
	 

	
	

}
