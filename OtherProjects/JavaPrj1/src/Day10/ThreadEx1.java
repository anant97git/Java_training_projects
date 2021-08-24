package Day10;

class MyThread extends Thread { 
	String ss;
	public MyThread(String S)	{  ss=S;	}
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx1 { 		
        public static void main(String [] args  ) {
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		t1.start();
		t2.start();
       }
}