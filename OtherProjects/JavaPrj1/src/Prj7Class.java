
class Employee{
	int Eid;
	String name;
	int Paid_amount;
	
	public void empType() {
		System.out.println("Employee type not known");
	}
}

class WagesEmp extends Employee{
	
	public void empType() {
		System.out.println("Wages Employee");
	}
}

class SalEmp extends Employee{
	
	public void empType(){
		System.out.println("Monthly employee");
	}
	
}

class EmpFrame{
	
	public void tellType(Employee e) {
		e.empType();
	}
}

public class Prj7Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpFrame f = new EmpFrame();
		
		Employee e1 = new Employee();
		f.tellType(e1);
		//e1.empType();
		
		Employee e2 = new WagesEmp();
		f.tellType(e2);
		//e2.empType();
		
		Employee e3 = new SalEmp();
		f.tellType(e3);
		//e3.empType();
	}

}
