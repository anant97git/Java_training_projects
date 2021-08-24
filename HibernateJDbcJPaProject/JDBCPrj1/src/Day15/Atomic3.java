package Day15;


import java.util.concurrent.atomic.AtomicInteger;

public class Atomic3 {
  public static void main(String args[])
  {
         AtomicInteger val = new AtomicInteger(0);

      int c = val.addAndGet(6); 
      System.out.println("Updated value: "
                         + c);
  }
}