package com.vm.session.test;

public class BankTask {
	private double balanceleft;
	 private double interestpa;
	 public BankTask(int balanceleft, double interestpa) {
	 
	  this.balanceleft = balanceleft;
	  this.interestpa = interestpa;
	 }
	 public void depositMoney(int amount)
	 {
	  balanceleft =+amount;
	 }
	 public void withdrawMoney(int amount)
	 {
	  balanceleft =balanceleft - amount;
	 }
	 public void addInterest()
	 {
	  balanceleft =(balanceleft + balanceleft * interestpa);
	 }
	 public double getBalance()
	 {
	  return balanceleft;
	 }
	}

