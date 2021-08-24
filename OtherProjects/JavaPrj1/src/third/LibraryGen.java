package third;

import java.util.*;


class Book{
	int bid;
	String bname;
	
	Book(){
		
	}
	
	Book(int id, String name){
		bid = id;
		bname = name;
	}
	
	public void add(int id, String name) {
		bid = id;
		bname = name;
	}
	
	public int getid() {
		return bid;
	}
	
	public String getname() {
		return bname;
	}
	
	public String toString() {
		return "Book :- id = "+bid+" , name : "+bname;
	}
}

class Newspaper{
	int nid;
	String nname;
	
	Newspaper(){
		
	}
	
	Newspaper(int id, String name){
		nid = id;
		nname = name;
	}
	
	public void add(int id, String name) {
		nid = id;
		nname = name;
	}
	
	public int getid() {
		return nid;
	}
	
	public String getname() {
		return nname;
	}
	
	public String toString() {
		return "Newspaper :- id = "+nid+" , name : "+nname;
	}
}

class Video{
	int vid;
	String vname;
	
	Video(){
		
	}
	
	Video(int id, String name){
		vid = id;
		vname = name;
	}
	
	public void add(int id, String name) {
		vid = id;
		vname = name;
	}
	
	public int getid() {
		return vid;
	}
	
	public String getname() {
		return vname;
	}
	
	public String toString() {
		return "Video :- id = "+vid+" , name : "+vname;
	}
}

public class LibraryGen {
  public static void main(String args[]) {
	
	  List<Book> Blist = new ArrayList<Book>();
	  List<Newspaper> Nlist = new ArrayList<Newspaper>();
	  List<Video> Vlist = new ArrayList<Video>();
	  
	  Blist.add(new Book(1,"Abc"));
	  Blist.add(new Book(2,"xyz"));
	  
	  Nlist.add(new Newspaper(1,"Abc"));
	  Nlist.add(new Newspaper(2,"xyz"));
	  
	  Vlist.add(new Video(1,"Abc"));
	  Vlist.add(new Video(2,"xyz"));
	  
	  System.out.println("with genircs");
	  for (Book b : Blist) {
		  System.out.println(b);
	  }
	  
	  for (Newspaper n : Nlist) {
		  System.out.println(n);
	  }
	  
	  for (Video v: Vlist) {
		  System.out.println(v);
	  }
	  
	  System.out.println();
	  ArrayList arr = new ArrayList();
	  
	  arr.add(new Book(1,"abc"));
	  arr.add(new Newspaper(2,"xyz"));
	  arr.add(new Video(3,"wuv"));
	  
	  System.out.println("Without genircs :- ");
	  for (Object o : arr) {
		  System.out.println(o);
	  }
  }
}
