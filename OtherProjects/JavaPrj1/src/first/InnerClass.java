package first;


public class InnerClass { //java MainApp -> run -> MainApp.main(String[]);
	
	public static void main(String[] args) {
		A2 a=new A2();
		a.outerPrint();
		
		//static inner class
		A2.B b=new A2.B();
		b.print();
		
		//normal inner class
		A2.C1 c=a.new C1();
		c.print();
		
		//calling static method of static class
		A2.B.print2();
//		A2.C1.print2();
	}

}

class A2{  //javac generates A.class
	public void outerPrint() {
		System.out.println("I am inside Class A");
	}
	
	public static class B{  //javac generates A$B.class
		public void print() {
			System.out.println("I am inside Class A.B");
		}
		
		//static mathod of static class
		public static void print2() {
			System.out.println("Static Fxn");
		}
	}	
	public class C1{  //javac generates A$B.class
		
		public void print() {
			System.out.println("I am inside Class A.C");
		}
		

//		public static void print2() { /// problematic part of the code
//			System.out.println("Static Fxn");
//		}
		
	}	
}

