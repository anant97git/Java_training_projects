package io.javabrains;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccessCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date issuedDate;
	private boolean isActive;
	private String firmwareVersion;
	
	@OneToOne(mappedBy = "card")
	private Employee owner;
	
	public Employee getOwner() {
		return owner;
	}
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public String getFirmwareVersion() {
		return firmwareVersion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIssuedDate(Date date) {
		this.issuedDate = date;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
	
	@Override
	public String toString() {
		return "AccessCard [id=" + id + ", issuedDate=" + issuedDate + ", isActive=" + isActive + ", firmwareVersion="
				+ firmwareVersion + "]";
	}	
}
