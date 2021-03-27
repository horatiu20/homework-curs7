package ro.fasttrackit.homework7;

public class ThreePersons {
	private String name;
	private int age;
	private boolean isMarried;

	void setName(String newName) {
		name = newName;
	}

	void setAge(int newAge) {
		age = newAge;
	}

	void marriageStatus(boolean newIsMarried) {
		 isMarried = newIsMarried;
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
