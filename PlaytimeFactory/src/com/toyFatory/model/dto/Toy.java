package com.toyFatory.model.dto;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class Toy implements Comparator<Toy>{
	private String toyName;
	private int age;
	private int price;
	private String color;
	private String date;
	
	private Set<String> material = new HashSet<>();
	
	public Toy() {}
	public Toy(String toyName, int age, int price, String color, String date, Set<String> material) {
		super();
		this.toyName = toyName;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
		this.material = material;
	}

	
	public static Comparator<Toy> byDate = new Comparator<Toy>() {
		
		@Override
		public int compare(Toy o1, Toy o2) {
			return o1.getDate().compareTo(o2.getDate());
		}
	};
	
	
	public static Comparator<Toy> byAge = new Comparator<Toy>() {
		
		@Override
		public int compare(Toy o1, Toy o2) {
			return o1.getAge()-o2.getAge();
		}
	};
	
	
	
	@Override
	public String toString() {
		String materialString = String.join(", ", material);
		return String.format("이름:%s / 가격 : %d / 색강 : %s / 사용가능연령 : %d / 제조년월일 : %s / 재료 : %s",
				toyName,price,color,age,date, materialString);
	}
	
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Set<String> getMaterial() {
		return material;
	}
	public void setMaterial(Set<String> material) {
		this.material = material;
	}
	@Override
	public int compare(Toy o1, Toy o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
