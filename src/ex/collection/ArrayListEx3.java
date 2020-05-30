package ex.collection;
import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		//Vetor의 용량(capacity)와 크기(size) 실험
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize(); //빈 공간을 없앰.(용량과 크기가 같아짐), 새로운 배열 생성, 기존객체는 GC에 의해 제거
		System.out.println("====After trimToSize() ====");
		print(v);
		
		v.ensureCapacity(6);  //capacity 6으로 증가, 새로운 인스턴스 생성
		System.out.println("====After ensureCapacity(6) ====");
		print(v);
		
		v.setSize(7); // size를 7로 증가 , capacity도 2배로 증가, 빈공간 null값
		System.out.println("====After setSize(7) ====");
		print(v);
		
		v.clear(); // v안에 있던 값들을 제거, size 0, capacity는 변동없음.
		System.out.println("====After clear() ====");
		print(v);

	}
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
	}

}

 /* ArrayList나 Vector 같이 배열을 이용한 자료구조는 옹량을 변경해야할 때 새로운 배열을 생성하 후
  기존의 배열로부터 새로 생성된 배열로 데이터를 복사해야하기 때문에 효율이 떨어진다.
  처음에 인스턴스를 생성할 때 저장할 데이터의 개수를 잘 고려하여 충분한 용량의 인스턴스 생성이 중요 */
