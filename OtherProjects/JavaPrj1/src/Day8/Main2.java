package Day8;

//interface Predicate<T>{
//    Boolean test(T);
//}

import java.util.function.*;

public class Main2 {
	Boolean fn(int x) {
		return x>7;
	}
	static void fun(Predicate<Integer> p, int x) {
		System.out.println(p.test(x)); //fn(x) /fn2(x)
	}
   public static void main(String args[]) {
      Predicate<Integer> p=new Main2() :: fn;
      fun(p, 10); //true
      fun(p, 3); //false
   }
}