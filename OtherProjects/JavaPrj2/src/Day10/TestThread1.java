package Day10;

import java.io.*;
import java.util.*;

class Chat1 {
	boolean flag = false;
    Scanner sc = new Scanner(System.in);
	public synchronized void Question() {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		Scanner sc1 = new Scanner(System.in);
		System.out.println(" person1 :- ");
		String msg = sc.nextLine();
//		System.out.println("Person1 : - "+msg);
		flag = true;
		notify();
	}

	public synchronized void Answer() {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		Scanner sc2 = new Scanner(System.in);
		System.out.println(" person2 :- ");
		String msg = sc.nextLine();
//		System.out.println("Person2 :- "+msg);
		flag = false;
		notify();
	}
}
class T11 implements Runnable {
	Chat1 m;

	public T11(Chat1 m1) {
		this.m = m1;
		new Thread(this).start();
	}

	public void run() {
		
		    while(true)
		    {
			m.Question();
		    }
	}
}

class T21 implements Runnable {
	Chat1 m;

	public T21(Chat1 m2) {
		this.m = m2;
		new Thread(this).start();
	}

	public void run() {
		    while(true)
		    {
			m.Answer();
		}
	}
}

public class TestThread1 {
	public static void main(String[] args) {
		Chat1 m = new Chat1();
		new T11(m);
		new T21(m);
	}
}