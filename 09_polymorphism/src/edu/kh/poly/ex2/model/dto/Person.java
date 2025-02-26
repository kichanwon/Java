package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{
	
	private String name;
	
	public Person() {}
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void eat() {
		System.out.println("Use Fork&knife to eat");
	}

	@Override
	public void breath() {
		System.out.println("Breath with nose");
	}

	@Override
	public void move() {
		System.out.println("Walk it like I Talk it");
	}
	
	@Override
	public String toString() {
		return String.format("Person : %s / %s",super.toString(),name);
	}
}
