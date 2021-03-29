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
- a method that drinks a specific amount of liquid and returns a message
corner cases:
- when you try to drink from a closed bottle, a message is printed out (System.out.println)
- when you try to drink and there's not enough liquid, a message is printed out
- when you try to open an opened bottle a message is printed out
- FIND MORE*/

public class Main {
	public static void main(String[] args) {
		System.out.println("-----Person-----");
		Person myPerson = new Person("Maria", 27, false);
		System.out.println("Name: " + myPerson.getName());
		System.out.println("Age: " + myPerson.getAge());
		System.out.println("Is Married: " + myPerson.marriageStatus());

		System.out.println("-----3 Persons-----");
		Person myPerson1 = new Person("Ana", 35, true);
		System.out.println("- Person 1 name: " + myPerson1.getName());
		System.out.println("Age: " + myPerson1.getAge());
		System.out.println("Is Married: " + myPerson1.marriageStatus());

		Person myPerson2 = new Person("George", 65, true);
		System.out.println("- Person 2 name: " + myPerson2.getName());
		System.out.println("Age: " + myPerson2.getAge());
		System.out.println("Is Married: " + myPerson2.marriageStatus());

		Person myPerson3 = new Person("Laura", 5, false);
		System.out.println("- Person 3 name: " + myPerson3.getName());
		System.out.println("Age: " + myPerson3.getAge());
		System.out.println("Is Married: " + myPerson3.marriageStatus());

		System.out.println("-----Product-----");
		Product myProduct = new Product("ASUS", 1000, 127, "desktop");
		System.out.println("Name: " + myProduct.getName());
		System.out.println("Price: " + myProduct.getPrice());
		System.out.println("Quantity: " + myProduct.getQuantity());
		System.out.println("Category: " + myProduct.getCategory());
		System.out.println("Is in stock: " + myProduct.hasStock());
		System.out.println("Is a laptop: " + myProduct.isCategory());

		System.out.println("-----3 Products-----");
		Product myProduct1 = new Product("HP", 1250, 35, "laptop");
		System.out.println("- Product 1 Name: " + myProduct1.getName());
		System.out.println("Price: " + myProduct1.getPrice());
		System.out.println("Quantity: " + myProduct1.getQuantity());
		System.out.println("Category: " + myProduct1.getCategory());
		System.out.println("Is in stock: " + myProduct1.hasStock());
		System.out.println("Is a laptop: " + myProduct1.isCategory());

		Product myProduct2 = new Product("Dell", 2000, 0, "desktop");
		System.out.println("- Product 2 Name: " + myProduct2.getName());
		System.out.println("Price: " + myProduct2.getPrice());
		System.out.println("Quantity: " + myProduct2.getQuantity());
		System.out.println("Category: " + myProduct2.getCategory());
		System.out.println("Is in stock: " + myProduct2.hasStock());
		System.out.println("Is a laptop: " + myProduct2.isCategory());

		Product myProduct3 = new Product("MSI", 1300, 50, "laptop");
		System.out.println("- Product 3 Name: " + myProduct3.getName());
		System.out.println("Price: " + myProduct3.getPrice());
		System.out.println("Quantity: " + myProduct3.getQuantity());
		System.out.println("Category: " + myProduct3.getCategory());
		System.out.println("Is in stock: " + myProduct3.hasStock());
		System.out.println("Is a laptop: " + myProduct3.isCategory());

		System.out.println("-----Bottle-----");
		Bottle myBottle = new Bottle(3000, 500, false);
		System.out.println("The bottle has more liquid than total capacity ? " + myBottle.moreLiquid());
		System.out.println("Available liquid: " + myBottle.getAvailableLiquid());
		myBottle.emptyCapacity();
		myBottle.setOpenBottle(true);
		myBottle.open();
		myBottle.setCloseBottle(true);
		myBottle.close();
		myBottle.setDrink(200);
		myBottle.drink();
		myBottle.tryToDrink(false);
	}
}
