package ex.generics;
import java.util.*;

class FruitEx {
	String name;
	int weight;
	
	FruitEx (String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString()  { return name + "(" + weight + ")"; }
	
}

class AppleEx extends FruitEx {
	AppleEx(String name, int weight) {
		super(name, weight);
	}
}

class GrapeEx extends FruitEx {
	GrapeEx(String name, int weight) {
		super(name, weight);
	}
}

//class AppleComp implements Comparator<AppleEx> {
//	public int compare(AppleEx t1, AppleEx t2) {            //중복제거!!
//		return t2.weight - t1.weight;
//	}
//}
//
//class GrapeComp implements Comparator<GrapeEx> {
//	public int compare(GrapeEx t1, GrapeEx t2) {
//		return t2.weight - t1.weight;
//	}
//}

class FruitComp implements Comparator<FruitEx> {    //Apple과 Grape의 조상인 Fruit로 정의
	public int compare(FruitEx t1, FruitEx t2) {
		return t2.weight - t1.weight;
	}
}

public class GenericsEx3 {

	public static void main(String[] args) {
		
		FruitBoxEx<AppleEx> appleBox = new FruitBoxEx<AppleEx>();
		FruitBoxEx<GrapeEx> grapeBox = new FruitBoxEx<GrapeEx>();
		
		appleBox.add(new AppleEx("GreenApple", 300));
		appleBox.add(new AppleEx("GreenApple", 100));
		appleBox.add(new AppleEx("GreenApple", 200));
		
		grapeBox.add(new GrapeEx("GreenGrape", 400));
		grapeBox.add(new GrapeEx("GreenGrape", 300));
		grapeBox.add(new GrapeEx("GreenGrape", 200));
		
		//Collections.sort(appleBox.getList(), new AppleComp());
		//Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);

	}

}

class FruitBoxEx<T extends FruitEx> extends BoxEx<T> {}
class BoxEx<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() {return list;}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

