package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//이름, 정수를  한쌍으로 한 Map 자료구조를 구현
		//김자바 : 100, 박자바 : 70
		//시험응시자(key) => keySet()
		//점수(value) => values() : Collection => Iterator
		//총점과 평균, 최고점수, 최저점수 출력
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 100);
		map.put("박자바", 70);
		map.put("강자바", 80);
		map.put("최자바", 50);
		
		//key값 출력
		Set<String> set = map.keySet();
		System.out.println("시험응시자 : " + set);		
		
		//value값 출력
		Collection<Integer> values = map.values();
		System.out.println("점수 : " + values);
		Iterator<Integer> iter = values.iterator();
		
		int sum = 0;		
				
		while(iter.hasNext()) {
			int num = iter.next();
			sum += num;
		}	
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/map.size());
		System.out.println("최고점수 : " + Collections.max(map.values()));
		System.out.println("최저점수 : " + Collections.min(map.values()));
	}

}
