package first;

import java.util.*;

public class TwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; 
		//declare object of Scanner Class
		Scanner buf=new Scanner(System.in); 
		System.out.print("Enter value of a : "); 
		/*nextInt() method of Scanner class*/
		a=buf.nextInt(); 
		
		int b;
		buf = new Scanner(System.in);
		System.out.println("Enter value of b : ");
		b = buf.nextInt();
		
		System.out.println("sum = "+ (a+b));
		System.out.println("average = "+ ((float)(a+b))/2);
		
		
	}

}
