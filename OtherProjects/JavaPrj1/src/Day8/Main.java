package Day8;

//interface Consumer<T>{
//    void accept(T obj);
//}

import java.util.function.Consumer;

public class Main {
	void fn(int x) {
		x=x*x;
		System.out.println("Consumer function1 gives: " + x);	
	}
	void fn2(int x) {
		x=x+x;
		System.out.println("Consumer function2 gives: " + x);	
	}
	
	 void fun(Consumer<Integer> c) {
		c.accept(100);
	}
   public static void main(String args[]) {
       Consumer<Integer> c= new Main()::fn;
       Consumer<Integer> c2= new Main()::fn2;
//       new Main().fun(c);  //10000
       // why cannno we use - fun(c);
       new Main().fun(c2);
       
   }
}