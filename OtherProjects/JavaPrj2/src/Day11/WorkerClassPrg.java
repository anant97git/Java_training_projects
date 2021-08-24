package Day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//class WorkerThread implements Runnable {
//	private String message;
//
//	public WorkerThread(String s) {
//		this.message = s;
//		}
////
//    public void run() {
//		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
//		processmessage(); // Thread sleeps for 2 seconds
//		System.out.println(Thread.currentThread().getName() + " (End)"); // prints thread name
//	}
//  private void processmessage() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//
//public class WorkerClassPrg {
//	public static void main(String[] args) {
//		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
//   for (int i = 0; i < 10; i++) {
//		Runnable worker = new WorkerThread("" + i);
//			executor.execute(worker);// execute() worker returns void
//			}
//		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
//
//		System.out.println("Finished all threads");
//	}
//}


class WorkerThread implements Runnable {
	private String message;
	private String name;

	public WorkerThread(String s1, String s2) {
		this.name=s1;
		this.message = s2;
	}
//
	public void run() {
		System.out.println(name + " (Start) message = " + message);
		processmessage(); // Thread sleeps for 2 seconds
		System.out.println(name + " (End)"); // prints thread name
	}
 private void processmessage() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}


public class WorkerClassPrg {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads

		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("Pool-" + (i<5? 1 : 2)+ " Thread-" + i, "Message"+i);
			executor.execute(worker);// execute() worker returns void
		}
//
//		
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
//
		System.out.println("Finished all threads");
	}
}

