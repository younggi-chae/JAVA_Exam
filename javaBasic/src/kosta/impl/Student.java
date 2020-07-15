package kosta.impl;

public class Student extends Man {

	public Student(String name) {
		super(name);		
	}
	
	public void speak() {
		System.out.println(super.getName() + " 공부나 열심히해");
	}
	
}
