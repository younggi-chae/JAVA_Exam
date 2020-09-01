package ex.collection4;
import java.util.*;

public class HashSetEx2 {
  //중복된 값은 저장되지 않는 HashSet의 성질을 통해 로또번호 만들기
	
	public static void main(String[] args) {
		Set set = new HashSet();  //HashSet 생성
		
		for(int i = 0; set.size() < 6; i++) {  // 6개의 숫자를 뽑는다.
			int num = (int)(Math.random()*45)+1; // 1~45 숫자 랜덤으로 뽑아 num에 저장
			set.add(new Integer(num)); // num값을 set에 저장
		}
		
		List list = new LinkedList(set);  // set 값을 list로 저장
		Collections.sort(list);           // 번호를 작은 수부터 정렬
		System.out.println(list);
		

	}

}
