package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		
		Person	p = new Person();
		Fish	f = new Fish();
		
		p.setName("¿Que?");
		p.setType("human");
		p.setEatType("omnivore");
		
		f.setType("fish");
		f.setEatType("omnivore");
		
		System.out.println(p.toString());
		System.out.println(f.toString());
		System.out.println();
		
		Animal a1 = new Person();
		Animal a2 = new Fish();

		a1.ex();
		a1.breath();
		a1.move();
		a1.eat();
		System.out.println();
		
		a2.ex();
		a2.breath();
		a2.move();
		a2.eat();
	}
}
