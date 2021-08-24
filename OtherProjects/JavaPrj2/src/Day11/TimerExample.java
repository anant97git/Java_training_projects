package Day11;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample extends TimerTask {
	@Override
	public void run() {
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
	}

	private void completeTask() {
		try {
			// assuming it takes 2 secs to complete the task
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
public static void main(String args[]) {
		TimerExample timerTask = new TimerExample();
		// running timer task as daemon thread
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(timerTask, 0, 10 * 100);
		System.out.println("TimerTask started");
		// cancel after sometime
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("TimerTask cancelled");
		try {
			Thread.sleep(3000);
	
			
} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}