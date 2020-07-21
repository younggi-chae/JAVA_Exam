package kosta.sort;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		
		//최초의 정렬 : comparable -> compareTo() 오버라이드 구현
		//정렬기준 변경 : Comparator -> compare() 추상메서드 오버라이드
		
		Random r = new Random();
		
		TreeSet<Integer> set = new TreeSet<Integer>(new Decending());
		
		for(int i = 0; set.size() < 6; i++) {
			int num = r.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);

	}

}
