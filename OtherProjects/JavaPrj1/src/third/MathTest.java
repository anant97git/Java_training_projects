package third;

public class MathTest {
	   public static void main(String args[]) {
	       MathTest tester = new MathTest();
	      MathOperation addition = (int a, int b) -> a + b; 	//with type declaration
	      MathOperation subtraction = (a, b) -> a - b; 	//with out type declaration
	      MathOperation multiplication = (int a, int b) -> { return a * b; };	//with return & curly braces
	      MathOperation division = (int a, int b) -> a / b;	//without return & without curly braces
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	   }
	interface MathOperation {
	      int operation(int a, int b);
	   }
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }	
	}
