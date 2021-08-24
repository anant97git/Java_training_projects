package Day15;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
  public static void main(String args[])
  {

    AtomicInteger val = new AtomicInteger(0);

      System.out.println("Previous value: "+ val);

      val.lazySet(10);

     
      System.out.println("Current value: " + val);
  }
}