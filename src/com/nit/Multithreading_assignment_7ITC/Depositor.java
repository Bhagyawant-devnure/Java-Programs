package com.nit.Multithreading_assignment_7ITC;

public class Depositor extends Thread{
	private Account account;

	public Depositor(Account account) {
		
		this.account = account;
	}
	@Override
	public void run() {
		int deposite[]= {1000,6000,10000};
		for(int amount:deposite) {
			account.deposit(amount);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
		e.printStackTrace();
		}
	}}

}
