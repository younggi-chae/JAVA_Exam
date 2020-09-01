package ex.collection;
import java.util.*;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int LIMIT = 10; //자르고자 하는 문자의 개수를 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ4324";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT + 10);
		
		for(int i = 0; i < length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT)); //i부터 i+10까지 리스트추가 (-1)			} else {
				list.add(source.substring(i)); 
			}
		}
		for(int i = 0;i < list.size(); i++) {
			System.out.println(list.get(i)); //리스트에 저장된 객체를 차례대로 출력
		}

	}

}
