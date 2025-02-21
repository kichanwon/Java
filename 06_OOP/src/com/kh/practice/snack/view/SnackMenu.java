package com.kh.practice.snack.view;

import java.util.Scanner;
import com.kh.practice.snack.controller.SnackContoller;

public class SnackMenu {
	private Scanner sc = new Scanner(System.in);
	private SnackContoller scr = new SnackContoller();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int num = Integer.parseInt(sc.nextLine());		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());		
		
		scr.saveData(kind, name, flavor, num, price);
		
		System.out.print("저장한 정보를 확인하시겠습니다?(y/n) : ");
		char input = sc.nextLine().charAt(0);
		
		while (true) {
		if(input=='y'||input=='Y') {
			System.out.println(scr.confirmData());
			break;
		}else if(input=='n'||input=='N') {
			break;
		}else System.out.println("잘못된 입력입니다.");
		}

	}
}