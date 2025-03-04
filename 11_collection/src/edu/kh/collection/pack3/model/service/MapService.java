package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	
	
	public void ex1() {
		
		
		Map<Integer, String> map = new HashMap<>();
		
		
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "조길동");
		map.put(5, "박길동");
		map.put(6, "손길동");
		
		
		map.put(1, "아무개");
		map.put(7, "아무개");
		
		
		System.out.println(map);
		
	}
	
	
	public void ex2() {
		Member mem = new Member();
		mem.setId("usr01");
		mem.setPw("usrpw01");
		mem.setAge(19);
		
		System.out.println(mem.getId());
		System.out.println(mem.getPw());
		System.out.println(mem.getAge());
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		System.out.println( map.get("id") );
		System.out.println( map.get("pw") );
		System.out.println( map.get("age") );

		
		System.out.println("--------------------------------------");

		Set<String> set = map.keySet();
		
		for(String key : set) {
			System.out.println(map.get(key));
		}
	}
	
	
	public void ex3() {
		List<Map<String, Object>>list = new ArrayList<>();
		
		for(int i=0; i < 10; i++) {
			
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("id", "user0" + i);
			map.put("pw", "pass0" + i);
			
			list.add(map);
			
		}
		
		System.out.println(list);
		
		for( Map<String, Object> temp : list ) {
			System.out.println( temp.get("id") );
		}
		
	}
	
	
}
