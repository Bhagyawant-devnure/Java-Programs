package com.nit.Multithreading_assignment_7ITC;

public class ATMmchine {

	public static void main(String[] args) {
		Account account = new Account();
		 Drawer drawer = new Drawer(account);
		 Depositor depositor = new Depositor(account);
		 
		 drawer.start();
		 depositor.start();
	}

}
