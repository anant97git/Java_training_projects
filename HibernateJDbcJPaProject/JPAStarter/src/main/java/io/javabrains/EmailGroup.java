package io.javabrains;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class EmailGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "emailGroups")
	private Set<Employee> members = new HashSet<Employee>();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Employee> getMembers() {
		return members;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMembers(Set<Employee> members) {
		this.members = members;
	}
	
	public void addMembers(Employee employee) {
		this.members.add(employee);
	}
	
//	public Set<Employee> getMembers() {
//		return members;
//	}
//
//	public void setMembers(Set<Employee> members) {
//		this.members = members;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
}
