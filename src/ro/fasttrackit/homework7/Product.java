package ro.fasttrackit.homework7;

public class Product {
	private String name;
	private int price;
	private int quantity;
	private String category;

	public Product(String name, int price, int quantity, String category) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}

	String getCategory() {
		return category;
	}

	boolean hasStock() {
		if (quantity >= 1) {
			return true;
		} else {
			return false;
		}
	}

	boolean isCategory() {
		if (category == "laptop") {
			return true;
		} else {
			return false;
		}
	}
}
