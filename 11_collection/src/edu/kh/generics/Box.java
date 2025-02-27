package edu.kh.generics;

public class Box <T>{
//	T는 타입 파라미터
//	실제 사용 시 구체적인 타입으로 변환 (String, Integer 등)

	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}


}
