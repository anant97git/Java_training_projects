package Day16;

class A{
	public int x;
	public void print() {
		System.out.println(x);
	}
	A(){}
	A(A a){  //copy constructor
		this.x=a.x;
	}
}
public class DeepVsShallowCopy {
	public static void main(String[] args) {
		A a1=new A();
		a1.x=10;
		A a2=a1; //shallow copy ; ref of new A() is now being pointed by a1 as well as a2.
		A a3=new A(a1);  //a3 is the clone of a1; we are doing a deep copy here.
		a2.print(); //10
		a3.print();  //10
		a1.x=90;
		a2.print(); //90
		a3.print(); //10
		
	}
}
