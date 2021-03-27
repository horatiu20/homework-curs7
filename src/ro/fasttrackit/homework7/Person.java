package ro.fasttrackit.homework7;

public class Person {
	private String name;
	private int age;
	private boolean isMarried;

	public Person() {
		this.name = "Maria";
		this.age = 35;
		this.isMarried = true;
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
