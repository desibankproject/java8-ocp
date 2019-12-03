package collections;

class Dog {
	String name="Tommy";
	@Override
	public String toString() {
		return "Name - "+name;
	}
}

public class HashCodeDemo {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		System.out.println(dog1.hashCode());
		System.out.println(dog1.hashCode());
		System.out.println(dog1.hashCode());
		System.out.println(dog1.hashCode());
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());
	}
}
