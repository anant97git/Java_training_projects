
class Adder{ //overloading
	public void add(int x, int y) {  // 2 ints :Case1
		System.out.println("(int adder)"+ (x+y));
	}
	public void add(int x) { //1 int  : overloading with diff. no. of parameters :case2 compared with case1
		System.out.println("(single int adder)"+ (x+x));
	}
	
	public void add(double x, int y) { //1 double, 1 int: overloading with diff. type of params : case3 compared with case1
		System.out.println("(double + int  adder)"+ (x+(double)y));
	}
public void add(int x, double y) {//1 int, 1 double: overloading with diff series of params: case 4 compared with case 3
		System.out.println("(int + double adder)"+ (x+(int)y));
	}
	public void add(String x, String y) { //2 Strings; overloading with diff type of params: case5 compared with case 1
		System.out.println("(String adder)"+ (x+y));
	}
}


public class Prj8Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a=new Adder();
		a.add(5); //case 2
		a.add(5, 6); //case 1
		a.add(7.9, 5); //case 3
		a.add(5.6,8); //case 3
		a.add("Hello ", "Java Coders");  //case 5
	}

}
