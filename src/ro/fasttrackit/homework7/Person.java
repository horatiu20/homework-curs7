package ro.fasttrackit.homework7;

public class Person {
	private String name;
	private int age;
	private boolean isMarried;

	public Person(String name, int age, boolean isMarried) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	boolean marriageStatus() {
		return isMarried;
	}
}
