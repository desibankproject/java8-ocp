package functional;

public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	private String name;
	private int age;
	private String address;
	
	public Person(){
		this.name="Jhon";
		this.age=20;
		this.address="CA100";
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setDesignation(String address) {
		this.address = address;
	}
}
