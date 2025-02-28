package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {
	private Scanner sc = new Scanner(System.in);

	private List<Student> studentList = new ArrayList<>(); // Search(Select)

	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 20));
		studentList.add(new Student("고영희", 25, "경기도 안산", 'F', 80));
		studentList.add(new Student("강아지", 14, "대전 광역시", 'F', 100));
		studentList.add(new Student("오미나", 27, "충북 충주시", 'F', 90));
		studentList.add(new Student("박주희", 24, "경기도 광주", 'F', 70));
	}

//	private List<Student> studentList = new LinkedList<>();		//Add,Edit,Delete

	private List<Object> testList = new ArrayList<>();

	public void ex() {
//		List.add(Object e)		//add Object to List
		testList.add("문자열");
		testList.add(new Student("홍길동", 25, "서울", 'M', 90));
		testList.add(sc);
		testList.add(new Object());

		for (Object e : testList) {
			if (e instanceof Student) {
				System.out.println(((Student) e).getName());
			}
		}
	}

	/**
	 * display menu to choose what to do
	 * 
	 * @author name(contact)
	 */
	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("\n======학생 관리 프로그램======");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬");
			System.out.println("8. 이름순으로 정렬");
			System.out.println("0. 프로그램 종료");

			System.out.print("\n메뉴 번호 선택 : ");

			try {

				menuNum = sc.nextInt();
				sc.nextLine();

				switch (menuNum) {
				case 1:
					addStudent();
					break;
				case 2:
					selectAll();
					break;
				case 3:
					System.out.println(updateStudent());
					break;
				case 4:
					System.out.println(removeStudent());
					break;
				case 5:
					searchName1();
					break;
				case 6:
					searchName2();
					break;
				case 7:
					sortByAge();
					break;
				case 8:
					sortByName();
					break;
				case 0:
					System.out.println("프로그램 종료...");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요");
				}

			} catch (InputMismatchException e) {
				System.out.println("\nError : 입력형식이 유효하지 않습니다.");
				sc.nextLine();
				menuNum = -1;
			}

		} while (menuNum != 0);
	}

	/**
	 * 1. 학생 정보 추가 method
	 * 
	 * @return 삽입 성공 시 "성공" / 실패시 "실패" 문자열 반환
	 */
	public String addStudent() {
		System.out.println("======학생 정보 추가======");

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("지역 : ");
		String region = sc.nextLine();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("점수 : ");
		int score = sc.nextInt();

		if (studentList.add(new Student(name, age, region, gender, score))) {
			return "성공";
		} else {
			return "실패";
		}
	}

	/**
	 * 2. 학생 전체 조회 method List 가 비어있는 경우 "학생 정보가 없습니다." 출력 있는 경우 전체 학생 출력
	 */
	public void selectAll() {
		System.out.println("======학생 정보 조회======");

//		if(studentList.size()==0) {
		if (studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}

//		일반 for 문
		/*
		 * for(int i=0;i<studentList.size();i++) {
		 * System.out.println(studentList.get(i)); }
		 */

//		향상된 for 문
		int index = 0;
		for (Student std : studentList) {
//			System.out.println((++index) +"번 : "+ std);
			System.out.println((index++) + "번 : " + std);
		}
	}

	/**
	 * 3. 학생 정보 수정 method
	 * 
	 * -학생 정보가 studentLisst에 있는지 검사 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * 
	 * -인덱스 번호로 학생을 수정 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 반환
	 * 
	 * -studentList 범위내 인덱스 번호인지 검사, 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다"반환
	 * 
	 * -수정할 때 1. index 번째에 저장된 학생 정보 수정전 정보를 출력
	 * 
	 * 2. 이름,나이,지역,성별,점수 수정할 값 입력받기
	 * 
	 * 3. 수정이 완료되면 "000의 정보가 변경되었습니다." 반환
	 * 
	 * @return
	 */
	public String updateStudent() {
		System.out.println("======학생 정보 수정======");

		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();

		if (studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다.";
		}
		if (index < 0) {
			return "음수는 입력할 수 없습니다.";
		}
		if (studentList.size() < index) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		}

		System.out.println(studentList.get(index));
		System.out.println();

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("지역 : ");
		String region = sc.nextLine();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("점수 : ");
		int score = sc.nextInt();

//		기존의 정보 반환하여 temp에 저장
		Student temp = studentList.set(index, new Student(name, age, region, gender, score));

		return String.format("%s의 정보가 변경되었습니다.", temp.getName());
	}

	/**
	 * 4. 학생 정보 제거 method -학생 정보가 studentLisst에 있는지 검사 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * 
	 * -인덱스 번호로 학생을 수정 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 반환
	 * 
	 * -studentList 범위내 인덱스 번호인지 검사, 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다"반환
	 * 
	 * -삭제할 때 "정말 삭제하시겠습니까? (Y/N) : " 출력 Y 입력시 삭제후 "000님의 정보가 제거되었습니다. 리턴 N 입력시 삭제취소
	 * 후 취소 리턴
	 * 
	 * @return
	 */
	public String removeStudent() {
		System.out.println("======학생 정보 삭제======");

		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();
		sc.nextLine();

		if (studentList.isEmpty()) {
			return "입력된 학생정보가 없습니다.";
		}
		if (index < 0) {
			return "음수는 입력할 수 없습니다.";
		}
		if (studentList.size() < index) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		}

		System.out.println(studentList.get(index));
		System.out.println();

		System.out.println("정말 삭제하시겠습니까? (Y/N) : ");
		char input = sc.nextLine().charAt(0);

		if (Character.toUpperCase(input) == 'Y') {
			Student temp = studentList.remove(index);

			return String.format("%s님의 정보가 제거되었습니다.", temp.getName());
		} else if (Character.toUpperCase(input) == 'N') {
			return "취소";
		}
		return "¿huh?";
	}

	/**
	 * 5. 이름으로 검색(일치)
	 * 
	 * @return
	 */
	public void searchName1() {
		System.out.println("======이름 검색(일치)======");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		Boolean flag = false;

		for (Student stdArr : studentList) {
			if (stdArr.getName().equals(name)) {
				System.out.println(stdArr);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	/**
	 * 6. 이름으로 검색(포함)
	 * 
	 * @return
	 */
	public void searchName2() {
		System.out.println("======이름 검색(포함)======");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		Boolean flag = false;

		for (Student stdArr : studentList) {
			if (stdArr.getName().contains(name)) {
				System.out.println(stdArr);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	/**
	 * 7. 나이로 정렬
	 * 
	 * @return
	 */
	public void sortByAge() {
		System.out.println("======나이순으로 정렬======");
		Collections.sort(studentList);
		for (Student stdArr : studentList) {
			System.out.println(stdArr);
		}
	}

	/**
	 * 8. 이름으로 정렬
	 * 
	 * @return
	 */
	public void sortByName() {
		System.out.println("======이름순으로 정렬======");

//		Comparator<Student> nameCompare = Comparator.comparing(Student::getName);
//		Collections.sort(studentList, nameCompare);

		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
//				String.compareTo() 
//				String이 Camparable을 상속받아 재정의해둔 Method를 이용
			}
		});

		for (Student stdArr : studentList) {
			System.out.println(stdArr);
		}
	}

}