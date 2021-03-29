package ro.fasttrackit.homework7;

public class Bottle {
	private int totalCapacity;
	private int availableLiquid;
	private boolean open;
	private int drink;

	public Bottle(int totalCapacity, int availableLiquid, boolean open) {
		this.totalCapacity = totalCapacity;
		this.availableLiquid = availableLiquid;
		this.open = open;
	}

	public boolean moreLiquid() {
		if (availableLiquid > totalCapacity) {
			return true;
		} else {
			return false;
		}
	}

	public int getAvailableLiquid() {
		return availableLiquid;
	}

	public void emptyCapacity() {
		if (availableLiquid <= totalCapacity) {
			System.out.println("Remaining liquid: " + (totalCapacity - availableLiquid));
		} else {
			System.out.println("Bottle is full.");
		}
	}

	public void setOpenBottle(boolean newOpen) {
		this.open = newOpen;
	}

	public void open() {
		if (open) {
			System.out.println("Bottle is opened.");
		} else {
			System.out.println("Bottle is already opened.");
		}
	}

	public void setCloseBottle(boolean newOpen) {
		this.open = newOpen;
	}

	public void close() {
		if (open) {
			System.out.println("Bottle is closed.");
		} else {
			System.out.println("Bottle is already closed.");
		}
	}

	public void setDrink(int newDrink) {
		this.drink = newDrink;
	}

	public void drink() {
		if (drink <= availableLiquid) {
			System.out.println("Remaining liquid after drink: " + (availableLiquid - drink));
		} else {
			System.out.println("You cannot drink more than available quantity. Max is: " + availableLiquid);
		}
	}

	public void tryToDrink(boolean open) {
		if (open) {
			System.out.println("You drank.");
		} else {
			System.out.println("You cannot drink from a closed bottle.");
		}
	}
}