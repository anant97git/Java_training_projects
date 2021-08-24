package first;

//class Adder{ 
//	public int x; //instance variable;  its scope is it's Object scope
//    public int y;
//    public static int count=0;// class variable; its scope is the class or any of its object scope
//	public Adder(int a, int b) {
//		x=a;y=b;
//		count++;
//	}
//	public Adder() {
//		x=y=0;
//		count++;
//	}
//	public int add(int a) { //a is a parameter variable
//		int b=0; //local variable
//		//local variable and parameter variable have scope within the function
//		return x+y+a+b;
//	}
//	
//}
//public class Prj1Class {
//	public static void main(String[] args) {
//			Adder a=new Adder(7,8);
//			System.out.println("a.x (instance variable is: "+a.x);
//			System.out.println("a.count (static/class variable is: "+ a.count);
//			System.out.println("Adder.count (static/class variable is: "+ Adder.count);
//			System.out.println("a.add(4 as parameter variable) and b=10 as local variable is: "+a.add(4));
//			
//			
//	}
//}

import java.util.*; 
class Prj1Class  {	
	public static void main(String args[])  	{ 
		int a; 
		//declare object of Scanner Class
		Scanner buf=new Scanner(System.in); 
		System.out.print("Enter value of a : "); 
		/*nextInt() method of Scanner class*/
		a=buf.nextInt(); 
		System.out.println("Value of a:" +a); 
	} 
}
