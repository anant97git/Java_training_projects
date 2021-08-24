//
//
//package first;
//class A1{
//	static {
//		System.out.println("Static block initializer called");
//	}
//	int x;
//	{
//		System.out.println("Initializer called");
//		x=10;
//	}
//	public void display() {
//		System.out.println("Value of x: "+x);
//	}
//	public static  void display2() {
//		System.out.println("static method");
//	}
//}
//public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
//	static {
//		System.out.println("Static block: called even before main(static method)");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Before Instance created, but class Name is used: ");
//		A1 a;
//		System.out.println("Instance created: ");
//		a=new A1();
//		a.display();
//		A1.display2();
//		a.display2();
//
//	}
//
//}


//package first;
//class A1{
//	static {
//		System.out.println("Static block initializer called");
//	}
//	int x;
//	{
//		System.out.println("Initializer called");
//		x=10;
//	}
//	public void display() {
//		System.out.println("Value of x: "+x);
//	}
//	public static  void display2() {
//		System.out.println("static method");
//	}
//	
//	static {
//		System.out.println("static block initializer2 called");
//	}
//}
//public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
//	static {
//		System.out.println("Static block: called even before main(static method)");
//	}
//  void add(int a)
//  {
//	  System.out.println(a+a);
//  }
//	public static void main(String[] args) {
//		System.out.println("Before Instance created, but class Name is used: ");
//		A1.display2();
//		System.out.println("Instance created: ");
//		A1 a=new A1();
//		a.display();
//		(new MainApp()).add(4);
//		A1.display2();
//		a.display2();
//
//	}
//
//}


//package first;
//class A3{  //javac generates A.class
//	public void outerPrint() {
//		System.out.println("I am inside Class A3");
//	}
//	
//	public class B3{  //javac generates A$B.class
//		public void print() {
//			System.out.println("I am inside Class A3.B3");
//		}
//	}
//	
//}
//public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
//	
//	public static void main(String[] args) {
//		A3 a=new A3();
//		a.outerPrint();
//		A3.B3 b=a.new B3();
//		b.print();
//	}
//}


//package first;
//class A3{  //javac generates A.class
//	public void outerPrint() {
//		System.out.println("I am inside Class A3");
//	}
//	
//	public static class B3{  //javac generates A$B.class
//		public void print() {
//			System.out.println("I am inside static inner class A3.B3");
//		}
//	}
//	
//}
//public class MainApp { //java MainApp -> run -> MainApp.main(String[]);
//	
//	public static void main(String[] args) {
//		A3 a=new A3();
//		a.outerPrint();
//		A3.B3 b= new A3.B3();
//		b.print();
//	}
//}

package first;
class A3{  //javac generates A.class
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}
	
	public static class B3{  //javac generates A$B.class
		public static void print() {
			System.out.println("I am inside static inner Class A.B");
		}
	}
	
}
public class MainApp { 
	
	public static void main(String[] args) {
		A3 a=new A3();
		a.outerPrint();
		//A.B b=new A.B();
		A3.B3.print();
	}

}

