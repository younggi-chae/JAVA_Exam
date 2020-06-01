package ex.collection2;
import java.util.*;

public class StackQueueEx1 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue는 별도의 클래스를 제공하지 않는다.   Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("==Stack =="); //먼저 넣은 것이 나중에 꺼내지는 구조(LIFO)
		while(!st.empty()) {  // 비어있지 않을 때까지 while문 실행
			System.out.println(st.pop()); // 맨위의 객체를 꺼낸다.
		}
		
		System.out.println("==Queue ==");  //먼저 넣은 것이 먼저 꺼내지는 구조(FIFO)
		while(!q.isEmpty()) { 
			System.out.println(q.poll()); // 객체를 꺼내서 반환
		}

	}

}
