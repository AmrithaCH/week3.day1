package org.bank;

public class BankInfo {
	//saving(),fixed(),deposit()
	
	public void saving()
	{System.out.println("General guidelines for saving");}
	
	public void fixed()
	{System.out.println("General guildeline for fixed");}
	
	public void deposit(int amount)
	{System.out.println("General guideline for deposit "+amount);}
	
	public static void main(String[] args)
	{BankInfo b = new BankInfo();
	b.deposit(1000);}

}
