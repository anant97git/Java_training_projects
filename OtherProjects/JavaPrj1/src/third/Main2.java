package third;

interface A4
{
	int fn(int x);
}
class D implements A4
{
	public int fn(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class E implements A4
{
	public int fn(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
//class B{
//	int print(int x) {
//		System.out.println("This is a printing process");
//		return x*x;
//	}
//}
//class C{
//	int display(int x) {
//		System.out.println("This is a displaying process");
//		return (int) Math.random();
//	}
//}
public class Main2{
	static void api(A4 a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
//		A a1= x -> new B().print(x);
//		
//		A a2= new C() :: display;
		
		A4 a1=new D();
		A4 a2=new E();
		
		api(a1); //D.fn()
		api(a2);  //E.fn()
	}
}
