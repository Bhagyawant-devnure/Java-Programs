package com.nit.Multithreading_assignment_7ITC;

public class Drawer extends Thread{
	private Account account;

	public Drawer(Account account) {
		
		this.account = account;
	}
	@Override
	public void run() {
		int withdrawas[]= {500,1000,2000};
		for(int amount:withdrawas) {
			account.withdraw(amount);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
		e.printStackTrace();
		}
	}}

}
