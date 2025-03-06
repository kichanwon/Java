package edu.kh.io.pack3.model.dto;

import java.io.Serializable;

public class Member implements Serializable{

	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
}
