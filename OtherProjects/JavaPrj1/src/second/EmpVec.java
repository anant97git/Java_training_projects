package second;

import java.util.Vector;

class Emp{
	int id;
	String name;
	
	Emp(int id, String name){
		this.id = id;
		this.name = name;
		
		System.out.println("id = "+id+" , name = "+name);
	}
	
	public void show() {
		System.out.println("id = "+id+" , name = "+name);
	}
	
	public String toString() {
		return "Name : "+name+" , id "+id;
	}
}

public class EmpVec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Emp> ve = new Vector<Emp>();
		
		ve.add(new Emp(1,"Aj"));
		
		ve.add(new Emp(2,"Ph"));
		
		System.out.println(ve);
	}
}
