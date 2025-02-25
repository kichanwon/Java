package edu.kh.inheritance.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

import edu.kh.inheritance.model.dto.BasicPhone;
import edu.kh.inheritance.model.dto.SmartPhone;

public class Run {
	public static void main(String[] args) {
		/*
		SmartPhone SP = new SmartPhone("Samsung","Galaxy S20",2020,1200000,"Android",128);
		BasicPhone BP = new BasicPhone("Nokia","3310",2000,100000,true);
		
		SP.printInfo();
		System.out.println("=====================================");
		BP.printInfo();
		BP.checkKeyboard();
		*/
		
		
		
		Student[] stdArr = new Student[3];
		stdArr[0]=new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stdArr[1]=new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stdArr[2]=new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i=0;i<stdArr.length;i++) {
			System.out.println(stdArr[i].information());
		}
		
		System.out.println("======================================================================================================");
		Scanner sc = new Scanner(System.in);
		
		Employee[] empArr = new Employee[10];
		int count=0;
		
		do {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			empArr[count]=new Employee(name,age,height,weight,salary,dept);
			count++;

			System.out.print("계속 추가할래? (y/n) : ");
			char input = sc.nextLine().charAt(0);
			
			if (input=='y'||input=='Y') {
				continue;
			}else if (input=='n'||input=='N') {
				for(int i=0;i<count;i++) {
					System.out.println(empArr[i].information());
				}
				break;
			}else System.out.println("잘못된 입력입니다.");
		} while (true);
		

		
	/*
	 		System.out.print("이름 : ");
			String name = sc.nextLine();
			empArr[count].setName(name);
			System.out.print("나이 : ");
			empArr[count].setAge(sc.nextInt());
			System.out.print("신장 : ");
			empArr[count].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			empArr[count].setWeight(sc.nextDouble());
			System.out.print("급여 : ");
			empArr[count].setSalary(sc.nextInt());
			System.out.print("부서 : ");
			empArr[count].setDept(sc.nextLine());
			System.out.print("계속 추가할래? (y/n) : ");
			char input = sc.nextLine().charAt(0);
	 */
		}
}
