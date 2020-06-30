package ex.collection2;
import java.util.*;

// Priority Queue
public class QueueEx2 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue(); //숫자가 작은  즉, 우선순위가 높은 순서로 요소를 꺼낸다.
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); // 배열을 출력
		
		Object obj = null;
		
		while((obj = pq.poll()) != null) // 저장된 요소를 하나씩 꺼낸다.
			System.out.println(obj);

	}

}
