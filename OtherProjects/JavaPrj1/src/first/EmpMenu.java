package first;

import java.util.Scanner;

class Emp1{
	String name;
	static int count = 0;
	
	Emp1(String name){
		this.name = name; 
		count++;
	}
	
	static void display() {
		System.out.println("Total employee : "+count);
	}
}

public class EmpMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner buf=new Scanner(System.in);
		System.out.println("Enter value 1 for adding emp , otherwise loop will break");
		while (true)
		{
			System.out.println("enter the value : ");
			int i = buf.nextInt();
			
			if (i==1)
			{
				System.out.println("Enter the name of the employee :- ");
				Scanner buf2 = new Scanner(System.in);
				String name = buf2.nextLine();
				Emp1 e = new Emp1(name);
				
			}
			else if (i==2)
			{
				Emp1.display();
			}
			else if (i==3)
			{
				System.out.println("Exit menu");
				break;
			}
			else
			{
				System.out.println("wrong input , enter other values");
			}
		}
	}

}
