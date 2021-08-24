package third;

interface A5
{
	int fn(int x);
}
class B2{
	int print(int x) {
		System.out.println("This is a printing process");
		return x*x;
	}
}
class C2{
	int display(int x) {
		System.out.println("This is a displaying process");
		return x+x;
	}
}
public class Main3{
	static void api(A5 a) {
		System.out.println(a.fn(10));
	}
	public static void main(String[] ar) {
		A5 a1=new B2() :: print;
		A5 a2=new C2() :: display;
		
		api(a1); //a1.fn()->b.print()
		api(a2);  //a2.fn() -> C.display()
	}
}

