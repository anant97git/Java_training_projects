package com.hibernate;
import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Student implements Serializable {
	private static long serialVersionUID = 8633415090390966715L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentName;
	private int rollNumber;
	private String course;
//generate getter/setter
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return id;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getCourse() {
		return course;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
