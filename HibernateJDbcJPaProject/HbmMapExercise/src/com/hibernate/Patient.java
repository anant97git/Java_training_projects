package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {

	@Id
	@GeneratedValue
	private int patient_id;
	private String patient_name;
	private int age;
	private String address;
	private String disease;
	private String payment;
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Doctor doctor;

	public int getPatient_id() {
		return patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getDisease() {
		return disease;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", age=" + age + ", address="
				+ address + ", disease=" + disease + ", doctor=" + doctor + "]";
	}
	
	
}
