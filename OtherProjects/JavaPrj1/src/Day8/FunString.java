package Day8;

import java.util.function.*;

public class FunString {
	Integer fn(String x) {
		return x.length();
	}
	 void fun(Function<String, Integer> f, String x) {
		System.out.println(f.apply(x)); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Function<String, Integer> f=new FunString() :: fn;
      new FunString().fun(f, "Mohan"); //true
      new FunString().fun(f, "RamPrasad"); //false
   }
}