package Day10;

class MyThread3 implements Runnable { 
	String ss;
	public MyThread3(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx3 { 		
        public static void main(String [] args  ) {
		     Thread t1 = new Thread(new MyThread3("t1"));
		     Thread t2 = new Thread(new MyThread3("t2"));
		     t1.run(); // here, run is a normal function, it is not calling threads,
		     // but it is calling a function of normal object
		     // but start function calls threads
		     // Here,t1 and t2 donot go in threadpool
		     // by calling start() of t1 and t2, t1 and t2 go in threadpool
		     t2.run();
       }
}
