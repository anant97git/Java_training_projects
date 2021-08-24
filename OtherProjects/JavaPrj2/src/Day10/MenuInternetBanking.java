package Day10;

import java.io.*;
import java.util.*;

class Account2 { // the 'monitor'
	int balance;
	String name;
	public Account2(int b, String n) {
		name=n; balance = b;
	}
	public Account2() {}

	// if 'synchronized' is removed, the outcome is unpredictable
	public synchronized void deposit(int deposit_amount) {
		System.out.println("\nDeposit amount " + deposit_amount + " in account: "+ name);
		balance += deposit_amount;
	}

	public synchronized void withdraw(int deposit_amount) {
		System.out.println("\nWithdrawn amount" + deposit_amount+ " from account: "+ name);
		balance -= deposit_amount;
	}
public synchronized void enquire() {
		System.out.println("\nBalance for Account: " + name + " = " + balance);
	}
}

class DepoThread2 implements Runnable {
	Account2 account;
	int amt;

	public DepoThread2(Account2 s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.deposit(amt);
	}
}


class DrawThread2 implements Runnable {
	Account2 account;
	int amt;

	public DrawThread2(Account2 s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.withdraw(amt);
	}
}
class BalThread2 implements Runnable {
	Account2 account;

	public BalThread2(Account2 s) {
		account = s;
	}

	public void run() {
		account.enquire();
	}
}

public class MenuInternetBanking {

	public static void main(String args[]) {
		
		System.out.println("Menu Driven Internet System :-");
		System.out.println("Click following values ");
		System.out.println("Click 1 for create new account");
		System.out.println("Click 2 for withdrawing");
		System.out.println("Click 3 for depositing");
		System.out.println("Click 4 for getting balance");
		
		int cond = 1;
		Scanner sc = new Scanner(System.in);
		
		List<Account2> alist = new ArrayList<Account2>();
		
		while (cond == 1)
		{
			System.out.println("enter your choice :- ");
			int val = sc.nextInt();
			
			if (val == 1) {
				System.out.println("enterr the balance : ");
				int b = sc.nextInt();
				System.out.println("enter the account name :");
				String aname = sc.next();
				
				alist.add(new Account2(b, aname));
				System.out.println("new account is added ");
			}
			else if (val == 2) {
				System.out.println("enter the anmae : ");
				String aname = sc.next();
				System.out.println("enter the withdraw amount : ");
				int wam = sc.nextInt();
				
				Account2 acc1;
				int z = 0;
				
				for (Account2 a: alist) {
					if (a.name.equals(aname)) {
				       acc1 = a;
				       Thread t1 = new Thread(new DrawThread2(acc1, wam));
				       t1.start();
				       z = 1;
				       System.out.println("withdrawn done");
				       break;
					}
				}
				
				if (z==0)
					System.out.println("account not found");
			}
			else if (val == 3) {
				System.out.println("enter the anmae : ");
				String aname = sc.next();
				System.out.println("enter the deposit amount : ");
				int dam = sc.nextInt();
				
				Account2 acc1;
				int z = 0;
				
				for (Account2 a: alist) {
					if (a.name.equals(aname)) {
				       acc1 = a;
				       Thread t1 = new Thread(new DepoThread2(acc1, dam));
				       t1.start();
				       z = 1;
				       System.out.println("deposit done");
				       break;
					}
				}
				
				if (z==0)
					System.out.println("account not found");
			}
			else if (val == 4) {
				System.out.println("enter the anmae : ");
				String aname = sc.next();
				
				Account2 acc1;
				int z = 0;
				
				for (Account2 a: alist) {
					if (a.name.equals(aname)) {
				       acc1 = a;
				       Thread t1 = new Thread(new BalThread2(acc1));
				       t1.start();
				       z = 1;
				       System.out.println("balance shown");
				       break;
					}
				}
				
				if (z==0)
					System.out.println("account not found");
			}
			else
			{
				cond = 0;
				System.out.println(" wrong choice, menu exit");
			}
		}
		
		System.out.println("program ended");
	}
}
