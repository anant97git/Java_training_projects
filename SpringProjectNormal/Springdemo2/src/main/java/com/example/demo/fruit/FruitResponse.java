package com.example.demo.fruit;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FruitResponse {
	
	private  String errormessage;
	private  Boolean resultok ;
	private  Fruit fruit;
	private  LocalDateTime datetime ;
	
	FruitResponse(String e, Boolean r, Fruit f, LocalDateTime l){
		errormessage = e;
		resultok = r;
		fruit = f;
		datetime = l;
	}

	public String getErrormessage() {
		return errormessage;
	}

	public Boolean getResultok() {
		return resultok;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public void setResultok(Boolean resultok) {
		this.resultok = resultok;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	
}
