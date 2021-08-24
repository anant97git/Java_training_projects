package Day10;

class MyThread2 implements Runnable { 
	String ss;
	public MyThread2(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx2 { 		
        public static void main(String [] args  ) {
		     Thread t1 = new Thread(new MyThread2("t1"));
		     Thread t2 = new Thread(new MyThread2("t2"));
//		     Runnable t3 = new MyThread2("t3");
//        	MyThread2 t1 = new MyThread2("t1");
//        	MyThread2 t2 = new MyThread2("t2");
		     t1.start();
		     t2.start();
//		     t3.run();
       }
}
