package ex.collection;
import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 크기가 10인 ArrayList 생성
		  list1.add(new Integer(5));
		  list1.add(new Integer(4));  //Add메서드로 객체를 순서대로 저장
		  list1.add(new Integer(2));
		  list1.add(new Integer(0));
		  list1.add(new Integer(1));
		  list1.add(new Integer(3));
		  
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //list1의  index[1]부터 [3]까지 가져옴
		  print(list1, list2);
          
		  Collections.sort(list1); //sort메서드를 통해 정렬
		  Collections.sort(list2);
		  print(list1, list2);
		  
		  System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
	      //list2의 객체들이 list1에 포함되어 있는지 확인,  true
		  
		  list2.add("B");
		  list2.add("C");
		  list2.add(3, "A");  //index[3]에 "A"추가
		  print(list1, list2);
		  
		  list2.set(3, "AA"); // index[3] 위치에 "AA" 저장
		  print(list1, list2);
		  
		  System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		  print(list1, list2); //list2 객체와 겹치는 list1 객체들을 제외하고 나머지 객체 제거
		  
		  for(int i = list2.size()-1; i >= 0; i--) {
			  if(list1.contains(list2.get(i))) //만약 list2의 객체와 list1의 객체가 겹치는 것이 있다면?
				  list2.remove(i); //list2의 0,2,4제거 
		  }
		  print(list1, list2);
	}
          static void print(ArrayList list1, ArrayList list2) {
        	  System.out.println("list1 : "+ list1);
        	  System.out.println("list2 : "+ list2);
        	  System.out.println();
          }
	
	}


