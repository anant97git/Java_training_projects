package com.example.demo.userPackage;

public class UserRest{
	String FirstName;
	String LastName;
	String Email;
	String UserId;
	public UserRest(){}
	
	public UserRest(String f,String l,String e,String u)
	{
		FirstName = f;
		LastName = l;
		Email = e;
		UserId = u;
	}
	
	public void setFirstName(String f){
		FirstName = f;}
	public void setLastName(String l){
		LastName = l;}
	public void setEmail(String e){
		Email = e;}
	public void setUserId(String u){
		UserId = u;}
	public String getFirstName() {return FirstName;}
	public String getLastName() {return LastName;}
	public String getEmail() {return Email;}
	public String getUserId() {return UserId;}
}