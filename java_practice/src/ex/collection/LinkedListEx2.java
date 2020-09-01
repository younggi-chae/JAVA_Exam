package ex.collection;
import java.util.*;

public class LinkedListEx2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(1000000);
		LinkedList l1 = new LinkedList();
		
		add(a1);
		add(l1);
		
		System.out.println("==접근시간 테스트 ==");
		System.out.println("ArrayList : " + access(a1));  // 연속적으로 요소들이 메모리상에 존재하기 떄문에 간단한 수식으로 데이터의 주소를 얻어 접근한다.
		System.out.println("LinkedList : " + access(l1)); //불연속적으로 데이터가 연결되어 있어 처음부터 n번째 데이터까지 차례대로 따라가야만 원하는 데이터 값을 얻을 수 있다.
                                                          //데이터가 많을수록 LinkedList 접근성이 떨어짐.
		                                                  //ArrayList가 LinkedList보다 접근시간이 빠르다.
	}
	
	public static void add(List list) {
		for(int i=0; i < 100000; i++) list.add(i+"");
	}
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start ;
	}

}
        //Queue는 LinkedList, Stack은 ArrayList가 적합.
        /* 두 클래스의 장점을 이해용 두 클래스를 조합해서 사용하는 방법도 생각해 볼 수 있다.
         ArrayList a1 = new ArrayList(1000000);
         for(int i = 0; i < 100000; i++) a1.add(i+"");
         
         LinkedList l1 = new LinkedList(a1);
         for(int i = 0; i < 1000;i++) li.add(500, "X"); */