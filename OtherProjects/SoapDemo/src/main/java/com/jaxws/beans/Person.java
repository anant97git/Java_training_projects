package com.jaxws.beans;

import java.io.Serializable;
public class Person implements Serializable{
	private static long serialVersionUID = -5577579081118070434L;
	private String name;
	private int age;
	private int id;
@Override
	public String toString(){	return id+"::"+name+"::"+age;	}
//Generate getter and setters
public static long getSerialversionuid() {
	return serialVersionUID;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public int getId() {
	return id;
}
public static void setSerialversionuid(long serialversionuid) {
	serialVersionUID = serialversionuid;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setId(int id) {
	this.id = id;
}


}