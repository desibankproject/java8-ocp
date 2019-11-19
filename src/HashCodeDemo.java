class Dog {
	
	private String name;

	Dog(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Dog another=(Dog)obj;
		return name.equals(another.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}

public class HashCodeDemo {
	public static void main(String[] args) {
		Dog dog1=new Dog("Jocker");
		Dog dog2=new Dog("Jocker");
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());
	}
}
