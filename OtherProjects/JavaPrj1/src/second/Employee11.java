package second;

import java.util.ArrayList;

class GenEmp<T>{
	int id;
	T name;
	
	GenEmp(int id, T name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void show() {
		System.out.println("Employee value : id = "+id+" , name = "+name);
	}
}

public class Employee11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenEmp<String> g1= new GenEmp<String>(1,"Anant");
		g1.show();
		
		GenEmp<Integer> g2 = new GenEmp<Integer>(2,4);
		g2.show();
		
		ArrayList<GenEmp> al = new ArrayList<>();
		
		al.add(new GenEmp(3,"Ramesh"));
		al.add(new GenEmp(4,5));
		
		System.out.println("By arraylist, showing employee :- ");
		
		GenEmp g3 = al.get(0);
		g3.show();
		
		GenEmp g4 = al.get(1);
		g4.show();
	}

}
