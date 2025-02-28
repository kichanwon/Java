package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.Random;

public class Friend<E> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend() {
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public void pickLeader(ArrayList<Friend> Arr) {
		Double dValue = Math.random();
		int randNum= (int)(dValue*Arr.size());
		System.out.println(Arr.get(randNum).getName()+"가 떡잎방범대 대장이다!!"); 
	}
}
