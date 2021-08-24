
public class Prj1Class {
	public static void main(String[] args) {
		Manager e1 = new Manager();
		
		e1.getMngrData("Ishu", 5000, 400, 5000); // Abstracted data can be accessed
		e1.printMngr(); // Abstracted data can be accessed
	}
}

class Emp {  //Encapsulated: Data Collected in single unit
	private String name;
	private int sal;
	protected int conveyance;
	public void getData(String nm, int s) {
		name = nm;
		sal = s;
	}	public void print() {
		System.out.println("Name : \"" +name+ "\" Salary : " + sal +"\n");
	}	}


class Manager extends Emp{
	private int bonus;
	public void getMngrData(String nm, int s, int conv, int bns) {
		//name = nm; //parent's private attributes are not accessible in child class
		getData(nm,s); //parent's public attributes are accessible in child class
		conveyance=conv;//parent's protected attributes are accessible in child class
		bonus=bns; //own private attributes accessible throughout the class 
	}	
public void printMngr() {
		print();
		System.out.println("Conveyance : " +conveyance+ " bonus : " + bonus +"\n");
	}	}