package com.hw2.model.dto;

public class Employee extends Person{
	private String position;
	
	public Employee() {}
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getInfo() {
		return String.format("ID : %s , 이름 : %s , 직책 : %s", id,name,position);
	}
	
	
	//Setter/Getter
	public String getPostion() {
		return position;
	}
	public void setPostion(String postion) {
		this.position = postion;
	}
}
