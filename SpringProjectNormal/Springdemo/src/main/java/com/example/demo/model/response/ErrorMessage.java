package com.example.demo.model.response;

import java.util.Date;

public class ErrorMessage {
	
	private Date timestep;
	private String message;
	
	public ErrorMessage(){}
	
	public ErrorMessage(Date timestep, String message){
		this.timestep = timestep;
		this.message = message;
	}
	
	public Date getTimestep() {
		return timestep;
	}
	public void setTimestep(Date timestep) {
		this.timestep = timestep;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
