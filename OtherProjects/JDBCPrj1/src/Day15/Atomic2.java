package Day15;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic2 {
    public static void main(String args[])
    {
  
        
        AtomicInteger val = new AtomicInteger(0);
  
        
        System.out.println("Previous value: "
                           + val);
  
        
        boolean res = val.compareAndSet(0, 6);
  
       
        if (res)
            System.out.println("The value was"
                               + " updated and it is "
                               + val);
        else
            System.out.println("The value was "
                               + "not updated");
    }
}