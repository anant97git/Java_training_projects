package third;

class A2{
	int x;
	public A2 print() {
		System.out.println("Next Iteration is from print() : " +  x);
		return new A2(8);
	}
	public A2 forward() {
		System.out.println("Next Iteration is from forward(): " +  x);
		return new A2(5);
	}
	public void last() {
		System.out.println("last Iteration : " +  x);

	}
	public A2(int a) {x=a;}
	public A2() {}
}
public class Mainer{
	public static void main(String[] ar) {
		A2 a=new A2(9);
		a.print().forward().print().forward().last();
	}
}
