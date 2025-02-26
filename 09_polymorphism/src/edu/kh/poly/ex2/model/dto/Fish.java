package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal{

	public Fish() {}	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}


	@Override
	public void eat() {
		System.out.println("Eating chop-chop");
	}

	@Override
	public void breath() {
		System.out.println("breath with gill");
	}

	@Override
	public void move() {
		System.out.println("using tail to move(swim)");
	}

	@Override
	public String toString() {
		return String.format("Fish : %s ",super.toString());
	}
}
