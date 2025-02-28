package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	private List<Animal> animals = new ArrayList<>();

	public Zoo() {}
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void showAnimals() {
		int index=0;
		for(Animal arr:animals)
		animals.get(index++).sound();
	}

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int input=0;
		
		do {
			System.out.println("******KH 동물원******");
			System.out.println("원하는 작업을 선택하세요");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			try {
				input = sc.nextInt();
				sc.nextLine();
				switch (input) {
				case 1: showAnimals(); break;
				case 2: System.out.println("프로그램을 종료합니다."); break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
			} catch (InputMismatchException e) {
				// TODO: handle exception
				sc.nextLine();
				input = -1;
			}
		} while (input!=2);
		
	}
}
