package Day11;

public class ThreadPrg3 extends Thread {
	public void run() {
		System.out.println("Start.. ");
		try {
			Thread.sleep(300);
		} catch (InterruptedException ie) {
		}
		System.out.println("End.. ");
	}
public static void main(String[] args) {
		ThreadPrg3 c1 = new ThreadPrg3();
		ThreadPrg3 c2 = new ThreadPrg3();
		System.out.println("Main Start.. ");
		c1.start();
		try {
			c1.join(); // Waiting for c1 to finish
		} catch (InterruptedException ie) {
		}
		c2.start();
		System.out.println("Main Ends.. ");
	}
}