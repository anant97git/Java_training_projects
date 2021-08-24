
public class Prj5Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortTermStudent st = new ShortTermStudent();
		st.setid(1);
		st.setname("Anant");
		st.setduration(3);
		
		System.out.println("Short terrm student :- "+st.getid()+" , "+st.getname()+" , "+st.getduration());
		
		LongTermStudent lt = new LongTermStudent();
		lt.setid(2);
		lt.setname("Jain");
		lt.setCourse("Java");
		
		System.out.println("Long terrm student :- "+lt.getid()+" , "+lt.getname()+" , "+lt.getCourse());
	}

}

class Student1{
	int id;
	String name;
	
	public int getid()
	{
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
}

class ShortTermStudent extends Student1{
	int duration;
	
	public int getduration()
	{
		return duration;
	}
	
	public void setduration(int duration) {
		this.duration = duration;
	}
}

class LongTermStudent extends Student1{
	String course;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}