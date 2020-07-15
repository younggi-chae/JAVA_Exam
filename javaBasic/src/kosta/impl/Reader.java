package kosta.impl;

public class Reader extends Man implements Speakable {

	public Reader(String name) {
		super(name);	
	}

	@Override
	public void speak() {
		System.out.println(super.getName() + " 자바 화이팅");
	}
	
}
