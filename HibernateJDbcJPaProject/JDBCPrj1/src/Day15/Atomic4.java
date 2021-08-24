package Day15;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic4 {
  public static void main(String args[])
  {

      
      AtomicInteger val
          = new AtomicInteger(0);

      System.out.println("Previous value: "
                         + val);

      int res
          = val.decrementAndGet();

      
      System.out.println("Current value: "
                         + res);
  }
}