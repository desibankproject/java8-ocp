package dp;

import java.util.ArrayList;
import java.util.List;

final class Basket {

	final private String name;
	final private int price;
	final private List<String> fruits;

	public Basket(String name, int price, List<String> fruits) {
		this.name = name;
		this.price = price;
		this.fruits = new ArrayList<String>(fruits);
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public List<String> getFruits() {
		// make a defensive copy of list when you are returning back
		return new ArrayList<String>(fruits);
	}

	@Override
	public String toString() {
		return "Basket [name=" + name + ", price=" + price + ", fruits=" + fruits + "]";
	}

	public static void main(String[] args) {
		List<String> fList = new ArrayList<String>();
		fList.add("A");
		fList.add("B");
		fList.add("C");

		Basket basket = new Basket("Magic", 1000, fList);
		System.out.println(basket);
		fList.add("Minh");
		System.out.println(basket);

	}
}