package Day10;

public class InternetBankingSystem {
	public static void main(String[] args) {
		Account accountObject = new Account();
		Thread t1 = new Thread(new DepoThread(accountObject, 10000));
		Thread t2 = new Thread(new DrawThread(accountObject, 2000));
		Thread t3 = new Thread(new BalThread(accountObject));
		t1.start();
		t2.start();
		t3.start();
	}
}


class Account { // the 'monitor'
	int balance;

	// if 'synchronized' is removed, the outcome is unpredictable
	public synchronized void deposit(int deposit_amount) {
		System.out.println("\nDeposit amount" + deposit_amount);
		balance += deposit_amount;
	}
public synchronized void withdraw(int deposit_amount) {
		System.out.println("\nWithdrawn amount" + deposit_amount);
		balance -= deposit_amount;
	}

	public synchronized void enquire() {
		System.out.println("\nBalance=" + balance);
	}
}
class DepoThread implements Runnable {
	Account account;
	int amt;

	public DepoThread(Account s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.deposit(amt);
	}
}


class DrawThread implements Runnable {
	Account account;
	int amt;

	public DrawThread(Account s, int a) {
		account = s;
		amt = a;
	}

	public void run() {
		account.withdraw(amt);
	}
}
class BalThread implements Runnable {
	Account account;

	public BalThread(Account s) {
		account = s;
	}

	public void run() {
		account.enquire();
	}
}