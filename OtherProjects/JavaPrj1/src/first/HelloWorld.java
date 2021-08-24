package first;

public class HelloWorld {
	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp(5000);
	}
}
class Emp { 
	int sal;
	public Emp() {
		sal = 0;
		System.out.println("Default constructor in Employee with sal : " + sal);
	}
	public Emp(int s) {
		sal=s;
		System.out.println("Parameterized Constructor in Employee for initialising attribute sal : "+ sal);
	}
}
