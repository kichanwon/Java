package edu.kh.oarr.run;

import java.text.DecimalFormat;
import java.util.Arrays;

import edu.kh.oarr.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];
		Employee E = new Employee();
		
		empArr[0] = new Employee();
		empArr[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		empArr[2] = new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");

		
		for(int i=0;i<empArr.length;i++) {
				System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.1f, %s, %s\n",
						i,empArr[i].getEmpNo(),empArr[i].getEmpName(),empArr[i].getDept(),empArr[i].getJob(),empArr[i].getAge(),empArr[i].getGender(),empArr[i].getSalary(),empArr[i].getBonusPoint(),empArr[i].getPhone(),empArr[i].getAddress());
		}

//=======================================================================
System.out.println("=======================================================================");

		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");
		System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.1f, %s, %s\n",
				empArr[0].getEmpNo(),empArr[0].getEmpNo(),empArr[0].getEmpName(),empArr[0].getDept(),empArr[0].getJob(),empArr[0].getAge(),empArr[0].getGender(),empArr[0].getSalary(),empArr[0].getBonusPoint(),empArr[0].getPhone(),empArr[0].getAddress());
		
		
		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		System.out.printf("emp[%d] : %d, %s, %s, %s, %d, %c, %d, %.1f, %s, %s\n",
				empArr[1].getEmpNo(),empArr[1].getEmpNo(),empArr[1].getEmpName(),empArr[1].getDept(),empArr[1].getJob(),empArr[1].getAge(),empArr[1].getGender(),empArr[1].getSalary(),empArr[1].getBonusPoint(),empArr[1].getPhone(),empArr[1].getAddress());
		
		
		
//=======================================================================
System.out.println("=======================================================================");

		int sum=0;

		for(int i=0;i<empArr.length;i++) {
			int year = (int)(12*(empArr[i].getSalary()+(empArr[i].getSalary()*empArr[i].getBonusPoint())));
			System.out.printf(
					"%s의 연봉 : %d원\n",
					empArr[i].getEmpName(),year
					);
			sum+=year;
		}
		
		
//=======================================================================
System.out.println("=======================================================================");

	int avg = sum/empArr.length;
//	System.out.printf("직원들의 연봉의 평균 : %d\n",avg);

	
	//formatter 결과는 String
	DecimalFormat formatter = new DecimalFormat("###,###");	
	System.out.printf("직원들의 연봉의 평균 : %s\n",formatter.format(avg));

	String strAmount = String.valueOf(avg);
	String regex = "(\\d)(?=(\\d{3})+$)";
	String repalcement = "$1,";
	
	String Line = strAmount.replaceAll(regex, repalcement);
	System.out.printf("직원들의 연봉의 평균 : %s\n",Line);

//	39,240,000
	/*
	
	System.out.print("직원들의 연봉의 평균 : ");
	for (int i=0;i<Integer.toString(avg).length();i++) {
		System.out.printf("%c",Integer.toString(avg).charAt(i));
		if((i+1)%3==0&&i!=empArr.length)System.out.print(",");
	}
	

	 1) 문자열 뒤집어서 %3으로 쉼표 넣어 저장하고 다시 뒤집기
	 2) 
	 
	 */
	}
}
