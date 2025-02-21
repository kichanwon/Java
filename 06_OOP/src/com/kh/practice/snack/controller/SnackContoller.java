package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackContoller {
	private Snack s =new Snack();

	public SnackContoller() {}

	public String saveData(String kind, String name,String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		String data = String.format("%s(%s - %s) %d개 %d원"
				,s.getKind(),s.getName(),s.getFlavor(),s.getNumOf(),s.getPrice());
		return data;
	}
}
