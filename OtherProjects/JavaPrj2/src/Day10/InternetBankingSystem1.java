package Day10;

public class InternetBankingSystem1 {
	public static void main(String[] args) {
		Account1 accountObject1 = new Account1(1000, "Abc");
		Thread t11 = new Thread(new DepoThread1(accountObject1, 10000));
		Thread t12 = new Thread(new DrawThread1(accountObject1, 2000));
		Thread t13 = new Thread(new BalThread1(accountObject1));
		Account1 accountObject2 = new Account1(5000, "Xyz");
Thread t21 = new Thread(new DepoThread1(accountObject2, 10000));
		Thread t22 = new Thread(new DrawThread1(accountObject2, 2000));
		Thread t23 = new Thread(new BalThread1(accountObject2));
		t11.start();
		t12.start();
		t13.start();
		t21.start();
		t22.start();
		t23.start();
		t11.run();
		t13.run();
		t11.run();
		t13.run();
	}
}
class Account1 { // the 'monitor'
	int balance;
	String name;
	public Account1(int b, String n) {
		name=n; balance = b;
	}
	public Account1() {}

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

class DepoThread1 implements Runnable {
	Account1 account;
	int amt;

	public DepoThread1(Account1 s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.deposit(amt);
	}
}


class DrawThread1 implements Runnable {
	Account1 account;
	int amt;

	public DrawThread1(Account1 s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.withdraw(amt);
	}
}
class BalThread1 implements Runnable {
	Account1 account;

	public BalThread1(Account1 s) {
		account = s;
	}

	public void run() {
		account.enquire();
	}
}