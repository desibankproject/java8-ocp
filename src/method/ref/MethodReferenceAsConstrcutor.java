package method.ref;


class Dog {
	String name="Oie";
	int age=1;
	public Dog() {
		
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public void show() {
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
}

interface DataGen<T> {
	public T get(String name,int age); 
}

public class MethodReferenceAsConstrcutor {
	
	public static void main(String[] args) {
		/*DataGen<Dog> dataGen=(name,age) ->new Dog(name,age);*/
		
		DataGen<Dog> dataGen=Dog::new;
		
	}
}
