package Day7;

interface MathInt{
	
	void operation(int a, int b);
}

class MathOp{
	
	void add(int a, int b) {
		System.out.println(" sum of "+a+" and "+b+" is "+(a+b));
	}
	
	void sub(int a, int b) {
		System.out.println(" minus of "+a+" and "+b+" is "+(a-b));
	}
	
	void mult(int a, int b) {
		System.out.println(" product of "+a+" and "+b+" is "+(a*b));
	}
	
	void div(int a, int b) {
		if (b==0)
		{
			System.out.println("there is error as b is zero");
		}
		else
		{
		System.out.println(" div of "+a+" and "+b+" is "+(a/b));
		}
	}
}

public class MathExercise {
	static void api(MathInt m)
	{
		m.operation(10, 10);
	}
	public static void main(String args[])
	{
		MathInt a = new MathOp() :: add;
//		a.operation(10, 10);
		api(a);
		
		MathInt s = new MathOp() :: sub;
//		s.operation(10, 1);
		api(s);
		
		MathInt m = new MathOp() :: mult;
//		a.operation(10, 10);
		api(m);
		
		MathInt d = new MathOp() :: div;
//		d.operation(10, 10);
		api(d);
	}
}
