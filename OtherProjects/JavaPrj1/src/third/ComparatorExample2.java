package third;

//import java.util.*;
//
//class Emp implements Comparator<Emp>, Comparable<Emp> {
//	public String name;
//	public int age;
//
//	Emp() {
//	}
//
//	Emp(String n, int a) {
//		name = n;
//		age = a;
//	}
//
//	// Overriding the compareTo method
//	public int compareTo(Emp d) {
//		return (this.name).compareTo(d.name);
//	}
//
//	// Overriding the compare method to sort the age
//	public int compare(Emp d, Emp d1) {
//		return d.age - d1.age;
//	}
//}
//
//
//public class ComparatorExample2 {
//	public static void main(String args[]) {
//		List<Emp> list = new ArrayList<Emp>();
//		list.add(new Emp("Ram", 23));
//		list.add(new Emp("Rohan", 22));
//		list.add(new Emp("Roy", 30));
//		list.add(new Emp("Tom", 24));
//		Collections.sort(list);// Sorts the array list
//		for (Emp a : list)
//			System.out.print(a.name + ", ");
//		Collections.sort(list, new Emp()); // Sorts the array list using comparator
//		System.out.println(" \n\n\nSorted According to Age\n\n");
//for (Emp a : list)// printing the sorted list of ages
//			System.out.print(a.name + " : " + a.age + ", ");
//	}
//}


import java.util.*;

class Emp implements Comparable<Emp> {
	public String name;
	public int age;

	Emp() {
	}

	Emp(String n, int a) {
		name = n;
		age = a;
	}

	// Overriding the compareTo method
	public int compareTo(Emp d) {
		return (this.name).compareTo(d.name);
	}

	// Overriding the compare method to sort the age
	
}
class A implements Comparator<Emp>{
	public int compare(Emp d, Emp d1) {
		return d.age - d1.age;
	}
}

public class ComparatorExample2 {
	public static void main(String args[]) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("Ram", 23));
		list.add(new Emp("Rohan", 22));
		list.add(new Emp("Roy", 30));
		list.add(new Emp("Tom", 24));
		Collections.sort(list);// Sorts the array list
for (Emp a : list)
			System.out.print(a.name + ", ");
		Collections.sort(list, new A()); // Sorts the array list using comparator
		System.out.println(" \n\n\nSorted According to Age\n\n");
		for (Emp a : list)// printing the sorted list of ages
			System.out.print(a.name + " : " + a.age + ", ");
	}
}