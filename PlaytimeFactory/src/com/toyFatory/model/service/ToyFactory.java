package com.toyFatory.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyFatory.model.dto.Toy;


public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toySet = new HashSet<>();
	private Map<Integer, String> map = new HashMap<>();
	
	public ToyFactory() {
		map.put(1, "면직물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");

		toySet.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", add(1, 4) ));
		toySet.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", add(1, 2) ));
		toySet.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", add(1, 2) ));
		toySet.add(new Toy("캣냅", 8,27000, "보라색", "19960128", add(1, 2) ));
		toySet.add(new Toy("파피", 8, 57000, "빨간색", "19931225", add(1, 2, 4) ));
	}
	
	/**
	 * Material 추가
	 * materials 에 전달받은 값들을 추가
	 * Set 으로 반환하는 메서드
	 * @param newMaterials
	 * @return Set<String> addedMaterials
	 */
	public Set<String> add(Integer...newMaterials) {
		Set<String> addedMaterials = new HashSet<String>();
		
		for (Integer materialKey : newMaterials) {
			// 맵에서 해당 번호(key)에 대응하는 재료를 가져와 추가
			String materialValue = map.get(materialKey);
			
			if(materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		
		return addedMaterials;
	}
	
	/**
	 * Menu display
	 * 
	 */
	public void displayMenu() {

		int menuNum = 0;


		do {
			System.out.println("\n<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 삭제");
			System.out.println("0. 종료");
			System.out.println();
			System.out.print("선택 : ");

			try {
				menuNum = sc.nextInt();
				sc.nextLine();
	
				switch (menuNum) {
				case 1 : displayToy(); break;
				case 2 : NewToy(); break;
				case 3 : deleteToy(); break;
				case 4 : byDate(); break;
				case 5 : byAge(); break;
				case 6 : addMat(); break;
				case 7 : deleteMat(); break;
				case 0:
					System.out.println("종료되었습니다.");
					break;
				default:
					System.out.println("선택지에 있는 번호만 입력하세요!");
					break;
				}

		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			}
			
		} while (menuNum != 0);
	}
	
	/**
	 * 전체 장난감 조회 (출력 )메서드
	 * 
	 */
	public void displayToy() {
		
		System.out.println("<전체 장난감 목록>");
		
		int index = 1;
		
		for(Toy toy : toySet) {
			System.out.println(index + ". " + toy);
			index++;
		}	
	}

	/**
	 * 새로운 장난감 만들기
	 */
	public void NewToy(){
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		
		// 기존에 있는지 확인
		for(Toy existing : toySet) {
			
			if(existing.getToyName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}
		
			
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.nextLine();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력) : ");
		String manufactureDate = sc.nextLine();
		
		// 재료 저장할 컬렉션
		Set<String> materials = new HashSet<String>();
		while(true) {
			
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			
			if(input.equals("q")) {
				break;
			}
			
			materials.add(input);

		}
		
		Toy newToy = new Toy(name, age, price, color, manufactureDate, materials);
		
		toySet.add(newToy);
		
		System.out.println("새로운 장난감이 추가되었습니다.");
		
	}

	/**
	 * 장난감 삭제하기

	 */
	public void deleteToy() {
		System.out.println("<장난감 삭제>");
		
		displayToy();

		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String deleteName = sc.nextLine();
		boolean flag=true;

		Iterator<Toy> iterator = toySet.iterator();
		while(iterator.hasNext()) {
			String tempName = iterator.next().getToyName();
			if ( deleteName.equals(tempName) ) {
				System.out.println(tempName+"이/가 삭제되었습니다.");
				flag=false;
			}
		}
		if(flag) {
			System.out.println("입력한 장난감이 존재하지 않습니다.");
		}
		
	}

	/**
	 * 장난감 제조일 순으로 조회하기
	 */
	public void byDate() {
		System.out.println("<제조일 순으로 장난감 정렬>");
		List<Toy> dateSet = new ArrayList<>(toySet);
		
		Collections.sort(dateSet, Toy.byDate);
		
		for (Toy temp : dateSet) {
			System.out.println(temp);
		}
	}
	
	/**
	 * 연령별 사용 가능한 장난감 리스트 조회하기
	 */
	public void byAge() {
		System.out.println("<연령별 사용가능한 순으로 장난감 정렬>");

		List<Toy> ageSet = new ArrayList<>(toySet);
		
		Collections.sort(ageSet, Toy.byAge);

		for (Toy temp : ageSet) {
			System.out.println(temp);
		}
	}
	
	/**
	 * 재료 추가
	 */
	public void addMat() {
		System.out.println("\n<재료 추가>");
		System.out.println("===현재 등록된 재료===");
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		System.out.println("==================");
		
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		System.out.print("재료명 입력 : ");
		String material = sc.nextLine();
		
//재료 유무 확인
		if(map.containsValue(material)) {
			System.out.println("이미 있는 재료입니다.");
			return;
		}
		
//key 값 확인
		if(map.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N): ");
			char input = Character.toUpperCase(sc.nextLine().charAt(0));
			
			if(input=='Y') {
				map.put(key, material);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다.");
			}else if (input=='N') {
				System.out.println("취소하셨습니다.");
			}else System.out.println("잘못된 입력입니다.");
		}
		
//재료 등록
		map.put(key, material);
		System.out.println("재료가 성공적으로 등록되었습니다.");
		
	}

	
	/**
	 * 재료 삭제
	 */
	public void deleteMat() {
		System.out.println("\n<재료 삭제>");
		System.out.println("===현재 등록된 재료===");
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		System.out.println("==================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String materialName = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			
			if(entry.getValue().equals(materialName)) {
				
				map.remove(entry.getKey());
				System.out.println("재료가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}
			
		}
		
		if(!flag) {
			
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
			
		}
	}
	
	
}
