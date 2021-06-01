package com.vm.session.test;

public class BankTesting {

	public static void main(String[] args) {
		BankTask savings=new BankTask(1000,0.06);
		  savings.withdrawMoney(1000);
		  savings.depositMoney(15000);
		  System.out.println("Current Balance in Saving Account :"+savings.getBalance());

	}

}
