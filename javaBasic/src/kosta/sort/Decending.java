package kosta.sort;

import java.util.Comparator;

public class Decending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//내림차순에 대한 정렬 기준 정의
		if(o1 < o2) {
			return 1;
		} else if(o1 > o2) {
			return -1;
		}
		return 0;
	}

}
