package ro.fasttrackit.homework7;

public class Product {
	private String name;
	private int price;
	int quantity;
	String category;

	public Product() {
		this.name = "ASUS";
		this.price = 1000;
		this.quantity = 1;
		this.category = "laptop";
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
		if (quantity != 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean isCategory() {
		if (category == "desktop") {
			return true;
		} else {
			return false;
		}
	}
}
