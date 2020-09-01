package generices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit {
	String name;
	int weigth;

	Fruit(String name, int weigth) {
		this.name = name;
		this.weigth = weigth;
	}

	public String toString() {
		return name + "(" + weigth + ")";
	}

}

class Apple extends Fruit {
	Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit {
	Grape(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple>{
	public int compare(Apple t1, Apple t2) {
		return t1.weigth - t2.weigth;
	}
}

class GrapeComp implements Comparator<Grape>{
	public int compare(Grape t1, Grape t2) {
		return t2.weigth - t1.weigth;
	}
}

class FruitComp implements Comparator<Fruit>{
	public int compare(Fruit t1, Fruit t2) {
		return t2.weigth - t1.weigth;
	}
}

public class FruitBoxEx1 {
	public static void main(String[] args) {

		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 100));
		appleBox.add(new Apple("GreenApple", 200));
		
		grapeBox.add(new Grape("GreenGrape", 400));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() { return list; }
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
