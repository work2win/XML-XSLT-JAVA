package com.work2win.ikm;

import java.math.BigDecimal;

interface Account{
	BigDecimal balance = new BigDecimal(0.00);
}
public class SavingsAccount implements Account{
	
	public SavingsAccount(BigDecimal initialvalue) {
		//balance = initialvalue;
	}
	
	
	public String toString() {
		return balance.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount i = new SavingsAccount(new BigDecimal(50.00));
		System.out.println(i);
	}

}
