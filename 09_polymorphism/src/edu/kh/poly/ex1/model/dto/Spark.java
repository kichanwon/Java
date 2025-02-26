package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{
	private double discountOffer;	//경차 할인혜택

	public Spark() {}
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}
	
	
	public double getDiscountOffer() {
		return discountOffer;
	}
	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString()+String.format(" / %.1f",discountOffer);
	}
}
