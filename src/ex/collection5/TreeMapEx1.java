package ex.collection5;
import java.util.*;

public class TreeMapEx1 {

	public static void main(String[] args) {
		String [] data = {"A", "K","A","K","D","K","A","K","K","K","Z","D"};
		
		TreeMap map = new TreeMap();  //범위검색이나 정렬이 필요한 경우 트리맵 사용
		
		for(int i = 0; i < data.length; i++) { 
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);      // data[i]를 하나씩 꺼내서 Integer타입으로 value에 저장
				map.put(data[i], new Integer(value.intValue()+1)); //key값이 포함되면 +1
			} else {
				map.put(data[i], new Integer(1));
			}
		}
        
		Iterator it = map.entrySet().iterator();
		
		System.out.println("== 기본정렬 ==");
		while(it.hasNext()) {  
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}
		System.out.println();
		
		Set set = map.entrySet();
		List list = new ArrayList(set);  //정렬을 위해 ArrayList로 전환
		
		Collections.sort(list, new ValueComparator());
		
		it = list.iterator();
		
		System.out.println("== 값의 크기가 큰 순서로 정렬 ==");
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}
	}
        static class ValueComparator implements Comparator {
        	public int compare(Object o1, Object o2) {
        		if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
        			Map.Entry e1 = (Map.Entry)o1;
        			Map.Entry e2 = (Map.Entry)o2;
        			
        			int v1 = ((Integer)e1.getValue()).intValue();
        			int v2 = ((Integer)e2.getValue()).intValue();
        			
        			return v2 - v1;  //값이 큰 순서로 정렬, 값에 대한 내림차순 정렬
        		}
        		return -1;
        	}
        }
        public static String printBar(char ch, int value) {
        	char[] bar = new char[value];
        	
        	for(int i = 0; i < bar.length; i++) {
        		bar[i] = ch;
        	}
        	return new String(bar);
        }
}
