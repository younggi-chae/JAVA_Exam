package ex.collection4;
import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		//TreeSet은 저장할 떄 이미 정렬하기 때문에 따로 정렬할 필요X
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
            System.out.println(set);
	}

}
