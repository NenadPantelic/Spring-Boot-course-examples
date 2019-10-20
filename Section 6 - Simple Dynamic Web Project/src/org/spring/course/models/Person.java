package org.spring.course.models;

public class Person {

	private int _age;
	private String _name;

	public Person(String name, int age) {
		super();
		_name = name;
		_age = age;
	}

	public int getAge() {
		return _age;
	}

	public String getName() {
		return _name;
	}

	public void setAge(int age) {
		_age = age;
	}

	public void setName(String name) {
		_name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + _name + ", age=" + _age + "]";
	}

}
