package Day7;

import java.util.Random;

interface A
{
	int fn(int x);
}
class B{ //existing class
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
	
	static int print2(int x) {
		System.out.println("new method");
		return x*x*x;
	}
}
class C{ //static method
	static int display(int x) {
		System.out.println("This is a displaying process");
		return (int) new Random().nextInt(10-1) + 1;
	}
}

public class Main{
	static void api(A a) {
		System.out.println(a.fn(100));
	}
	public static void main(String[] ar) {
		A a1= new B() :: print; //instance method
		A a2= C :: display;  //static
		A a3= Integer :: numberOfTrailingZeros; //arbitrary Object
		//static int	numberOfTrailingZeros(int i)
		//Returns the number of zero bits following the lowest-order ("rightmost") 
		api(a1); //a1.fn()->b.print()
		api(a2);  //a2.fn() -> C.display()
		
api(a3); //a3.fn()-> Integer.numberOfTrailingZeros()
	}
}