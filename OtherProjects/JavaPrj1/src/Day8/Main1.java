package Day8;
// supppliear code

//interface Supplier<T>{
//    T get();
//}

import java.util.function.*;

public class Main1 {
	int fn() {
		int x=10;
		x=x*x;
		System.out.println("Supplier function1 gives: " + x);
		return x;
	}
	int fn2() {
		int x=10;
		x=x+x;
		System.out.println("Supplier function2 gives: " + x);
		return x;
	}
	 void fun(Supplier<Integer> s) {
		System.out.println(s.get()); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Supplier<Integer> s=new Main1() :: fn2;
      Supplier<Integer> s2 = new Main1() :: fn;
       new Main1().fun(s);  
       new Main1().fun(s2);
   }
}

