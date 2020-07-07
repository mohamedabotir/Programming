package com.company;

public class Main {

    public static void main(String[] args) {
	Sync a=new Sync();
new Thread(){
	@Override
	public void run() {
		a.withdraw(30000);
	}
}.start();
		new Thread(){
			@Override
			public void run() {
				a.deposit(20000);
			}
		}.start();

    }
}
