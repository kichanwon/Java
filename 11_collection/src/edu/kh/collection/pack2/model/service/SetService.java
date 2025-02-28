package edu.kh.collection.pack2.model.service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetService {
	public void method1() {
		
//		HashSet 객체 생성
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
//		Set<String> set = new LinkedHashSet<>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의 민족");
		set.add("당근 마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		
	}
	
	
	
	
	
	
	public void method4() {
		Set<Integer> lotto = new TreeSet<>();
		
		Random random = new Random();
		
		while(lotto.size()<6) {
			lotto.add(random.nextInt(45)+1);
		}
		
		System.out.println(lotto);
	}
	
}
