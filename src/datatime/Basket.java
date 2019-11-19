package datatime;

import java.util.ArrayList;
import java.util.List;

final public class Basket {
	final private String name;
	final private int price;
	final private List<String> fruits;

	public Basket(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public List<String> getFruits() {
		//Creating defensive copy!
		return new ArrayList<>(fruits);
	}
	
	
	@Override
	public String toString() {
		return "Basket [name=" + name + ", price=" + price + ", fruits=" + fruits + "]";
	}

	public static void main(String[] args) {
		Basket basket=new Basket("Magic",122);
		System.out.println(basket);
		basket.getFruits().add("Grapes");
		System.out.println(basket);
	}

}
