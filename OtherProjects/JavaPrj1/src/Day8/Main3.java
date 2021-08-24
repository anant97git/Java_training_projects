package Day8;

//interface Function<T,R>{
//    R apply(T);
//}


	import java.util.function.*;

	public class Main3 {
		Boolean fn(int x) {
			return x>7;
		}
		static void fun(Function<Integer, Boolean> f, int x) {
			System.out.println(f.apply(x)); //fn(x) /fn2(x)
		}
	   public static void main(String args[]) {
	      Function<Integer, Boolean> f=new Main3() :: fn;
	      fun(f, 10); //true
	      fun(f, 3); //false
	   }
	}