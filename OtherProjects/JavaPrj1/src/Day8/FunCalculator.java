package Day8;

import java.util.*;
import java.util.function.*;
import java.util.function.BiFunction;


public class FunCalculator {
  public static void main(String args[])
  {
	  BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
	  System.out.println(add.apply(1, 2));
	  
	  BiFunction<Integer,Integer,Integer> sub = (a,b) -> (a>b?a-b:b-a);
	  System.out.println(sub.apply(1, 2));
	  
	  BiFunction<Integer,Integer,Integer> mult = (a,b) -> (a*b);
	  System.out.println(mult.apply(1, 2));
	  
	  BiFunction<Integer,Integer,Integer> div = (a,b) -> (b==0 ? 0 : (a>b?a/b:b/a));
	  System.out.println(div.apply(1, 0));
	  
//	  int y = 0;
//	  System.out.println(100/y);
  }
}
