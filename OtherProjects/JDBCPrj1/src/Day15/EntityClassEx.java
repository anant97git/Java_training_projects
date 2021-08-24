package Day15;

import java.sql.*;

class Emp{
	private int id;
	private String name;
	private int age;
	public Emp(){	}
	public Emp(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "id = "+this.id+" , name = "+this.name+" , this.age = "+this.age;
	}
}

class ORM{
	Connection conn;
	Statement ss;
	public ORM(Connection conn, Statement ss){
		this.conn = conn;
		this.ss = ss;
	}
	int save(Emp e1) {
		try {
			String qry = "Insert into emp values (" + e1.getId() + ",\' " + e1.getName() + "\', " + e1.getAge() + ")";
			int s=ss.executeUpdate(qry);			
			System.out.println("val = "+s);
			
			return s;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}	
}

public class EntityClassEx {
   public static void main(String args[]) {
	   String dbURL = "jdbc:mysql://localhost:3306/javadb";
	   try 
	   {
	   Class.forName("com.mysql.jdbc.Driver");  
	   Connection conn = DriverManager.getConnection(dbURL,"root", "");
	   Statement st = conn.createStatement();
	   
	   Emp e1 = new Emp(104,"Vivek",24);
	   
	   ORM o1 = new ORM(conn,st);
	   
	   int val = o1.save(e1);
	   
	   if (val == 1)
	   {
		   System.out.println("inserted successfully");
	   }
	   else {
		   System.out.println("not inserted");
	   }
	   conn.close();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	  }
   }
}
