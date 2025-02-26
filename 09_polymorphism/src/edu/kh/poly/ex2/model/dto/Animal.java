package edu.kh.poly.ex2.model.dto;

//	must be Abstract class if class has abstract in it
public abstract class Animal {
	//field
	private String type;
	private String eatType;
	
	//method
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	public Animal() {}
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}
	
//	Abstract Method
	public abstract void eat();		//
	public abstract void breath();	//
	public abstract void move();	//
	
//	Can write normal method in Abstract Class
	public void ex() {
		System.out.println("this is test method");
	}
	
	
	public String toString() {
		return String.format("%s / %s", type,eatType);
	}
}
