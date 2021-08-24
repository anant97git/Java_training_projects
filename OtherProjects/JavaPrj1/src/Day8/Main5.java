package Day8;

public class Main5 {
	public static void main(String args[]) {
		try {
			int x = 100;
			int[] xx = new int[10];
			System.out.println("Testing 1..");
			int y = 0;
			System.out.println("Testing 2..");
			
//			System.out.println(xx[11]);
			System.out.println("Testing 3..");
			int a = x * x;
			System.out.println("Testing 4..");
			// code that may raise exception
//			int data = 100 / 0;
			System.out.println("Testing 5..");
//			System.out.println(x + y + a + data);
			
System.out.println("Testing 6..");

		} catch (ArithmeticException e) {
			System.out.println(e); // e.toString() ->e.getMessage()
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e); 
//		}
		finally {
			System.out.println("All resources closed here: if try runs successfully or catch catches the exception or catch fails"); 
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}

