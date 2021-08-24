package third;

//interface A1{
//	void fn();
//	void fn2();
//}
//class Main{
//	public static void main(String[] arg)
//	{
//		A1 b=new A1(){                              //class Main$1 implements A
//			public void fn() {
//				System.out.println("Hello");
//			}
//			public void fn2() {
//				System.out.println("Hello2");
//			}
//			
//		};
//		
//		b.fn();
//	}
//}

//interface A1{
//	void fn();
//}
//
//class Main{
//	public static void main(String[] arg)
//	{
//		A1 a = () -> System.out.println("Hello");	
//		
//		a.fn();
//		
//	}
//}


//interface A1{ //case 1
//	void fn(int x,String s);
//}
//
//class Main{
//	public static void main(String[] arg)
//	{
//		//A a = (int x) -> System.out.println("Hello" + x);	
//		A1 a = (y,z) -> System.out.println("Hello " + (y*10) + z);	
//		a.fn(10," Hi");
//		
//	}
//}


//interface A1{ //case 2
//	void fn(int x);
//}
//class Main{
//	public static void main(String[] arg)
//	{
//		A1 a = x -> System.out.println("Hello " + x);	
//		a.fn(10);
//		
//	}
//}

//interface A1{ //case 3
	//curly braces are optional if we have a single statement only.
	//Not in case of multiple statements or with return keyword 
//	int fn(int x);
//}
//class Main{
//	public static void main(String[] arg)
//	{
//		A1 a = x -> {
//			System.out.println("Hello " + x);
//			return x*x;
//		};
//		a.fn(10);
//		
//	}
//}


//interface A1{ //case 3
//	void fn(int x);
//}
//class Main{
//	public static void main(String[] arg)
//	{
//		A1 a = x -> System.out.println("Hello " + x);
//		a.fn(10);
//		
//	}
//}


interface A1{ //case 4
	int fn(int x);
}
class Main{
	public static void main(String[] arg)
	{
		//A a = x -> {return x*x; };
		A1 a = x -> x*x;
		System.out.println(a.fn(10));
		
	}
}

