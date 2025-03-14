package edu.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	private boolean hasPhysicalKeyboard;
	
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}
	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	

	public BasicPhone() {}
	public BasicPhone(String brand, String model, int year, int price,boolean hasPhysicalKeyboard) {
		super(brand,model,year,price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	public void checkKeyboard() {
		if (hasPhysicalKeyboard==true) {
			System.out.println("이 휴대혼은 물리적 키보드가 있습니다.");
		}else {
			System.out.println("이 휴대혼은 물리적 키보드가 없습니다.");
		}
	}
	
	
	
	
}
