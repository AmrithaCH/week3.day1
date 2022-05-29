package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit(int amount)
	{System.out.println("Axis guidelines for deposit "+amount);}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit(1000);
		a.fixed();
		a.saving();

	}

}
