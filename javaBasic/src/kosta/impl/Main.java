package kosta.impl;

public class Main {

	public static void main(String[] args) {

		Object obj[] = { new Reader("둘리"), new Work("길동"), new Student("마이콜") };

		for (int i = 0; i < obj.length; i++) {
			Object o = obj[i];
			if (o instanceof Speakable) {
				((Speakable) o).speak();
			}

		}

	}
}
