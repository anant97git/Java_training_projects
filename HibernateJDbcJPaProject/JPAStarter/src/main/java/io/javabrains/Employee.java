package io.javabrains;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DATA")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "employee_name", length = 100)
	private String name;
	
	@Column(unique=true, length = 255, nullable = false)
	private String ssn;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date Dob;
	
	@Enumerated(EnumType.STRING)
	private EmployeeType type;
	
	@Transient
	private String debugString;
	
	@OneToOne
	private AccessCard card;
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private Set<PayStub> payStub = new HashSet<PayStub>(0);
	
	@ManyToMany
	private Set<EmailGroup> emailGroups = new HashSet<EmailGroup>();
	

	public Set<EmailGroup> getEmailGroups() {
		return emailGroups;
	}

	public void setEmailGroups(Set<EmailGroup> emailGroups) {
		this.emailGroups = emailGroups;
	}
	
	public void addEmailGroup(EmailGroup group)
	{
		this.emailGroups.add(group);
	}

	public Set<PayStub> getPayStub() {
		return payStub;
	}

	public void setPayStub(Set<PayStub> payStub) {
		this.payStub = payStub;
	}

	public AccessCard getCard() {
		return card;
	}

	public void setCard(AccessCard card) {
		this.card = card;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ssn=" + ssn + ", Dob=" + Dob + ", type=" + type + ", card="
				+ card  + ", age=" + age + "]";
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}
	
	public EmployeeType getType() {
		return type;
	}
	
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public int getAge() {
		return age;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}
