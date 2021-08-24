package third;

//interface A3
//{
//	int fn();
//}
//class B1{
//	int print() {
//		System.out.println("This is a printing process");
//		return 10;
//	}
//}
//public class Main1{
//	public static void main(String[] ar) {
//		A3 a=new A3() {
//			public int fn() {
//				return new B1().print();
//			}
//		};
//		System.out.println(a.fn());
//	}
//}


interface A3
{
	int fn(int x);
}
class B1{
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class C{
	int display(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
//public class Main1{
//	static void fnn(A3 a) {
//		System.out.println(a.fn(10));
//	}
//	public static void main(String[] ar) {
//		A3 a1= x -> new B1().print(x);
//		
//		A3 a2=new A3() {
//			public int fn(int x) {
//				return new C().display(x);
//			}
//		};
//		fnn(a1); //
//		fnn(a2);
//	}
//}

public class Main1{
	static void fnn(A3 a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
		A3 a1= x -> new B1().print(x);
		
		A3 a2= new C() :: display;
		fnn(a1); //
		fnn(a2);
	}
}
