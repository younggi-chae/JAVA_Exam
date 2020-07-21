package kosta.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam2 {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("조자바",23));
		list.add(new Person("이자바",99));
		list.add(new Person("강자바",58));
		list.add(new Person("오자바",77));
		list.add(new Person("유자바",62));
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//이름을 기준으로 오름차순 정렬
				if(o1.getName().compareTo(o2.getName()) >0) {
					return 1;  //1 자리를 바꾼		
				} else if(o1.getName().compareTo(o2.getName())<0) {
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println(list);
	}

}
