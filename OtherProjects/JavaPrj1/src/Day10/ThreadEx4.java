package Day10;

class MyThread4 extends Thread { 
	String ss="current Thread";
//	public MyThread(String S)	{  ss=S;	}
	
    public void run() {
		for(int i=0;i<10;i++)
			System.out.println(ss + " thread is running ... with Stage " + i);
    }		
}
public class ThreadEx4 { 		
        public static void main(String [] args  ) {
		MyThread4 t1 = new MyThread4();
		MyThread4 t2 = new MyThread4();
		t1.start();
		t2.start();
       }
}
