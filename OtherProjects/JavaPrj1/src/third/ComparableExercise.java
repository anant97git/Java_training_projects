package third;

import java.util.*;

class Emp1 implements Comparable<Emp1>{
	public String name;
	public int id;
	
	Emp1(){
		
	}
	
	Emp1(String n, int i){
		name = n;
		id = i;
	}
	
	public int compareTo(Emp1 e)
	{
		Integer i1 = this.name.length();
		Integer i2 = e.name.length();
		return i1.compareTo(i2);
	}
}

public class ComparableExercise {
	public static void main(String args[]) {
		List<Emp1> list = new ArrayList<Emp1>();
		list.add(new Emp1("Rama", 23));
		list.add(new Emp1("Rohani", 22));
		list.add(new Emp1("Roy", 30));
		list.add(new Emp1("Tommy", 24));
		Collections.sort(list);
		
		for (Emp1 e : list) {
			System.out.print(e.name+" ");
		}
	}
	
}
