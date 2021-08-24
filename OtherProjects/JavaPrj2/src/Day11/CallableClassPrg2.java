package Day11;

import java.util.*;
import java.util.concurrent.*;

class Task implements Callable<Long> {
	@Override
	public Long call() {
		long n = 0;
		for (long i = 0; i < 100; i++) {
			n += i;
		}
		return n;
	}
}
public class CallableClassPrg2 {
	public static void main(String args[]) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Callable<Long> c = new Task();
		Future<Long> future = executor.submit(c);
		try {
			Long result = future.get(); // waits for the thread to complete
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		executor.shutdown();
	}
}