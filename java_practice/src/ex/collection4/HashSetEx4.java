package ex.collection4;

import java.util.*;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);

	}

}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {  //name값과 age값이 중복으로 출력되기 때문에 비교작업 수행
		if (obj instanceof Person) {
			Person tmp = (Person) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}