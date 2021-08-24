package Day15;


import java.util.concurrent.atomic.AtomicInteger;

public class Atomic1 {

    public static void main(String[] args) throws InterruptedException {
        Shared sh = new Shared();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++)
                sh.inc();
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++)
                sh.inc();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sh.x);
       
    }
}

class Shared {
	AtomicInteger x= new AtomicInteger(0);
	
  
 void  inc() {
  x.incrementAndGet();
    
    }
    
}