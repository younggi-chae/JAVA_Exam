package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "NC");
		map.put("2", "두산");
		map.put("3", "키움");
		
		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
		}
		System.out.println("요소의 사이즈 : " + map.size());
		//System.out.println(map.get("3")); 
		
		//Map 전체목록을 출력
		//Map => Set => Iterator
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
		 Map.Entry<String, String> e = (Entry<String, String>) iter.next();
		 
		 System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}
	}

}
