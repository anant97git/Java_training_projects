
public class Prj2Class {

	public static void main(String args[])
	{
		Student John = new Student();
		
		System.out.println("output of readName function :- "+John.readName());
		
		John.displayName();
	}
}

class Student
{
	int Stud_id;
	String Stud_name;
	
	public String readName()
	{
		return Stud_name;
	}
	
	public void displayName()
	{
		System.out.println("Output of DisplayName() function -> Name : - "+Stud_name);
	}
	
}
