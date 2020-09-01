package ex.generics;
import java.util.*;

class Fruit               {public String toString() { return "Fruit"; }}
class Apple extends Fruit {public String toString() { return "Apple"; }}
class Grape extends Fruit {public String toString() { return "Grape"; }}
class Toy                 {public String toString() { return "Toy";   }}

public class GenericsEx1 {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		//Box<Grape> grapeBox = new Box<Apple>();  // 타입 불일치로 인한 에러발생.
        
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());  // void add(Fruit item)
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy());  // Box<Apple>에는 Apple만 담을 수 있다.
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple());  // Box<Toy>에는 Toy만 담을 수 있다.
		
	    System.out.println(fruitBox);
	    System.out.println(appleBox);
	    System.out.println(toyBox);
	}

}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)   { list.add(item);    }
	T get(int i)       { return list.get(i);}
	int size()         { return list.size();}
	public String toString()  { return list.toString(); }
}
