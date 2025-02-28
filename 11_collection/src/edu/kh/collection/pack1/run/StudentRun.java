package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {
	public static void main(String[] args) {
		StudentService service = new StudentService();

//		service.ex();
		
		service.displayMenu();
		
/*
				List<Integer> numberList = new ArrayList<>();
				
				numberList.add(15);
				numberList.add(10);
				numberList.add(19);
				numberList.add(18);
				numberList.add(1);
				numberList.add(11);
				numberList.add(134);
				numberList.add(11);
				numberList.add(16);
				
				Collections.sort(numberList);
		
				System.out.println(numberList);
*/
	}
}
