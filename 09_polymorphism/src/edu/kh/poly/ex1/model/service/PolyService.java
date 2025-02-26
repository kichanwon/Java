package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {
	public void ex1() {
		
		Car car = new Car();
		//부모타입 참조변수 = 부모객체주소
		
		Tesla tesla = new Tesla();
		//자식타입 참조변수 = 자식객체주소		
		
		Car car_1 = new Tesla();
		Car car_2 = new Spark();
		//부모타입 참조변수 = 자식객체주소						** Up Casting **
		//부모객체로 변환 -> 자식객체 고유의 필드,메소드 사용 불가		
		
		Tesla t1 = (Tesla)new Car();
		//자식타입 참조변수 = (자식타입 형변환)부모객체주소		** Down Casting **
		//자식객체로 변환			명시적 형변환만 ㄱㄴ		* 클래스간 반드시 형변환은 상속관계의 클래스끼리만 ㄱㄴ
		
		car_2.setEngine("motor");
//		car_2.setBatteryCapacity();
	}
	
	public void printCar(Car car) {
		System.out.println("엔진 : "+car.getEngine());
		System.out.println("연료 : "+car.getFuel());
		System.out.println("바퀴 : "+car.getWheel()+"개");
		System.out.println();	//줄바꿈
	}
	
	public Car createCar(int num) {
		switch (num) {
		case 1: Car c = new Car("경유엔진","경유",12);				return c;
		case 2: Tesla t = new Tesla("전기모터","전기",4,1000000);	return t;
		case 3: Spark s = new Spark("경차엔진","휘발유",4,0.5);		return s;
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}
	
	public void ex2() {

		Tesla t = new Tesla("전기모터","전기",4,1000000);
		
		Spark s = new Spark("경차엔진","휘발유",4,0.5);
		
		Car c = new Car("경유엔진","경유",12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("---------------------------------------------------------------");
		
		
		Car[] arr = {createCar(1),createCar(2),createCar(3)};
		
		System.out.println(arr[1] instanceof Car);		//True 부모->상속관계
		System.out.println(arr[1] instanceof Tesla);	//True 자기 본인
		System.out.println(arr[1] instanceof Spark);	//False spark != tesla
		
/*		
 * 향상된 for 문
 * 		for(DataType DataName : Array,collection){
 * 			code
 * 		}
		
		for (Car[] :arr) {
			
		}
 */
		
		
	}
	
	public void ex3() {
		Car c1 = new Tesla("전기모터","전기",4,1000000);
		
		//연산자 우선순위 조심!!!!!!!
		System.out.println(((Tesla)c1).getBatteryCapacity());
	}
	
	public void ex4() {
		Car c1 = new Tesla("전기모터","전기",4,1000000);

		//UpCasting 된 변수를 잘못 DownCasting 가능 -> 예외처리 필요
		if(c1 instanceof Spark) {
			Spark s1 = (Spark)c1;
			System.out.println("DownCast Car to Spark");
		}else {
			System.out.println("Not a Spark type");
		}		
	}

	public void binding() {
		Car c1 = new Car("경유엔진","경유",8);
		System.out.println(c1.toString());
//		String edu.kh.poly.ex1.model.dto.Car.toString ()
		
		Car c2 = new Spark("경차엔진","휘발유",8,0.5);
		System.out.println(c2.toString());
//		String edu.kh.poly.ex1.model.dto.Car.toString ()
		
		
	}
}
