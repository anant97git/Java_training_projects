package Day8;

import java.util.*;
public class ExceptExer {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input :- ");
		int a = sc.nextInt();
		
		try {
			int y = 1/a;
		}
		catch(Exception e) {
			System.out.println("exception :- "+e);
		}
		
		System.out.println("rest of the code");
	}
}
