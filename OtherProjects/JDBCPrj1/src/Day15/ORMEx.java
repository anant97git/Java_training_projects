package Day15;

import java.sql.*;
import java.util.*;

class Emp1
{
	private int id;
	private String name;
	private int age;
	public Emp1() {
	}
	public Emp1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class ORM1
{
	Statement ss;
	Connection c;
	ORM1(String driver,String connectUrl,String id,String password)
	{
		try {
		Class.forName(driver);
		c=DriverManager.getConnection(connectUrl,id,password);
		ss=c.createStatement();
		}
		catch(Exception e) {}
	}
	int save(Emp1 e)
	{
		try {
		String s="insert into emp values ("+e.getId()+",'"+ e.getName()+"'," +e.getAge()+")";
		int x=ss.executeUpdate(s);
		return x;
		}
		catch(Exception ee) {return 0;}
	}
	int update(Emp1 e) {
		try {
			String s = "update emp set age = "+25+" where id = "+e.getId();
			int x = ss.executeUpdate(s);
			return x;
		}
		catch(Exception ee) {return 0;}
	}
	int delete(Emp1 e) {
		try {
			String s = "delete from emp where id = "+e.getId();
			int x = ss.executeUpdate(s);
			return x;
		}
		catch(Exception ee) {return 0;}
	}
	void closeCon() {
		try {
			c.close();
			System.out.println("connectionn closed ");
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	List<Emp1> getAll(){
		List<Emp1> le = new ArrayList<Emp1>();
		try {
		String s = "select * from emp";
		ResultSet rs = ss.executeQuery(s);
		while (rs.next()) {
			Emp1 e = new Emp1();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setAge(rs.getInt(3));
			le.add(e);
		}
		}
		catch(Exception e) {	e.printStackTrace();
		}
		return le;
	}
}

public class ORMEx 
{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
				String driver="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/javadb";
				String u="root";
				String p="";
				ORM1 o=new ORM1(driver, url, u, p);
				Emp1 e1=new Emp1(105, "Tom", 30);
				
				int r=o.save(e1);
				System.out.println(r+ " Records inserted ");
				
				int up = o.update(e1);
				System.out.println(up+" records updated ");
				
				int del = o.delete(e1);
				System.out.println(del+" records deleted");
				
				List<Emp1> le = o.getAll();
				
				if (le.size() == 0) {
					System.out.println(" no emp object list");
				}
				else {
					System.out.println("list of emp :- ");
					
					for(Emp1 e:le)
					{
						System.out.println(e.toString());
					}
				}
				
				o.closeCon();
				
	}
}