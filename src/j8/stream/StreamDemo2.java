package j8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

class Person {
	private String name;
	private int age = 10;
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class StreamDemo2 {

	public static void main(String[] args) {
		Stream<String> streams = Arrays.asList("Nagendra", "Jhon", "James", "Amogh").stream();
		/*Stream<Person> smap = streams.map(t -> new Person(t));*/
		Stream<String> smap = streams.map(Person::new).map(Person::getName);
		System.out.println(smap);
		smap.forEach(System.out::println);
	}

}
