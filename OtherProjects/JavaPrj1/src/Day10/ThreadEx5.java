package Day10;

class MyThread5 implements Runnable { 
	String ss="current Thread";
//	public MyThread(String S)	{  ss=S;	}
	
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx5 { 		
        public static void main(String [] args  ) {
        	MyThread5 o=new MyThread5();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(new MyThread5());
		t1.start();
		t2.start();
       }
}