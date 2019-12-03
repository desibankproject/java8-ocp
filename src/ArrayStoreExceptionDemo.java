import java.util.Arrays;

class Dog {
	private String _owow;
	private String name;
	private String color;
	public Dog(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + "]";
	}
}

public class ArrayStoreExceptionDemo {
	public static void main(String[] args) {
		String[] arr = { "Apple", "Banana", "Grapes" };
		Object[] paa = arr;
		paa[0]="Tamato";
		System.out.println(Arrays.asList(arr));
		Dog[] dogs = {new Dog("A1", "White"),new Dog("A2", "black"),new Dog("A3", "Brown")};
		paa=dogs;
		paa[2]="Guava";
	}
}
