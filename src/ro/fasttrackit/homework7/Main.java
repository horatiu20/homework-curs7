package ro.fasttrackit.homework7;
/*1) create an object that represents a Person:
state: name, age, married
behavior: getName, getAge, isMarried
-----
2) create an application that creates 3 persons using the objects from exercise 1. Print them to the console
-----
3) create an object that represents a Product:
state: name, price, quantity, category
behavior: - getName, getPrice, getQuantity, getCategory
		  - hasStock : will return true if the quantity is not 0
		  - isCategory(String category) : return true if the category is equal to the parameter
-----
4) Create an application that creates 3 Products. Use each method of the object
-----
5) create an object that represents a bottle:
state : - total capacity
		- available liquid
		- open
behavior:
- a method that returns true/false if the bottle has more liquid
- a method that returns the available liquid
- a method that returns the empty capacity
- a method that opens the bottle and returns a message ("Bottle is opened")
- a method that closes the bottle and returns a message
- a method that drinks a specific amount of liquid  and returns a message
corner cases:
- when you try to drink from a closed bottle, a message is printed out (System.out.println)
- when you try to drink and there's not enough liquid, a message is printed out
- when you try to open an opened bottle a message is printed out
- FIND MORE*/

public class Main {
	public static void main(String[] args) {
		Person myPerson = new Person();
		System.out.println("Name: " + myPerson.getName());
		System.out.println("Age: " + myPerson.getAge());
		System.out.println("Is Married: " + myPerson.marriageStatus());

		ThreePersons myThreePersons = new ThreePersons();
		myThreePersons.setName("Ana");
		myThreePersons.setAge(25);
		myThreePersons.marriageStatus(false);
		System.out.println("Name: " + myThreePersons.getName());
		System.out.println("Age: " + myThreePersons.getAge());
		System.out.println("Is Married: " + myThreePersons.marriageStatus());

		myThreePersons.setName("Ioana");
		myThreePersons.setAge(18);
		myThreePersons.marriageStatus(false);
		System.out.println("Name: " + myThreePersons.getName());
		System.out.println("Age: " + myThreePersons.getAge());
		System.out.println("Is Married: " + myThreePersons.marriageStatus());

		myThreePersons.setName("George");
		myThreePersons.setAge(67);
		myThreePersons.marriageStatus(true);
		System.out.println("Name: " + myThreePersons.getName());
		System.out.println("Age: " + myThreePersons.getAge());
		System.out.println("Is Married: " + myThreePersons.marriageStatus());

		Product myProduct = new Product();
		System.out.println("Name: " + myProduct.getName());
		System.out.println("Price: " + myProduct.getPrice());
		System.out.println("Quantity: " + myProduct.getQuantity());
		System.out.println("Category: " + myProduct.getCategory());
		System.out.println("Is in stock: " + myProduct.hasStock());
		System.out.println("Is a desktop: " + myProduct.isCategory());

	}

}
