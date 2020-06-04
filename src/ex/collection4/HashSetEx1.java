package ex.collection4;
import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();  // 중복값은 저장되지 않는다. 
		                          // 1의 경우 하나는 String인스턴스 , 하나는 Integer인스턴스로 서로 다른 객체
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장
		}
		System.out.println(set);
	}

}
