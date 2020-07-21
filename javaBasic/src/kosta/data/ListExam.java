package kosta.data;

import java.util.LinkedList;

public class ListExam {

	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<String>();
		
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		while(!queue.isEmpty()) {
			String str = queue.pop();
			System.out.println(str);			
		}
		
//		stack.addLast(new Integer(12));
//		stack.addLast(new Integer(59));
//		stack.addLast(new Integer(7));
//		
//		while(!stack.isEmpty()) {
//			Integer num = stack.removeLast();
//			System.out.println(num);
//		}
	}

}
