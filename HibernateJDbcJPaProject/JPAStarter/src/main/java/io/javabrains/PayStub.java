package io.javabrains;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PayStub {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "start")
	private Date payPeriodStart;
	@Column(name = "end")
	private Date payPeriodEnd;
	private float salary;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "paystub_for")
	private Employee employee;
	
	
	
	@Override
	public String toString() {
		return "PayStub [id=" + id + ", payPeriodStart=" + payPeriodStart + ", payPeriodEnd=" + payPeriodEnd
				+ ", salary=" + salary + ", employee "+employee+"]";
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public Date getPayPeriodStart() {
		return payPeriodStart;
	}
	public Date getPayPeriodEnd() {
		return payPeriodEnd;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPayPeriodStart(Date payPeriodStart) {
		this.payPeriodStart = payPeriodStart;
	}
	public void setPayPeriodEnd(Date payPeriodEnd) {
		this.payPeriodEnd = payPeriodEnd;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
