package j8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Customer{
	private int age;

	public Customer(int age) {
		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}



	@Override
	public String toString() {
		return "Customer [age=" + age + "]";
	}
	
}

public class IntSteamToObject {
	public static void main(String[] args) {
	/*	List<Customer> customer = IntStream.range(1, 6) // IntStream -1-5
				.mapToObj(i -> new Customer(i)).collect(Collectors.toList());
		customer.forEach(System.out::println);*/
		//Primitive stream to Object Stream conversion
		List<Customer> customers = IntStream.range(1, 6) // IntStream -1-5
				.mapToObj(Customer::new).collect(Collectors.toList());
		customers.forEach(System.out::println);
		
		//Object stream to Object Primitive conversion
		IntStream intStream=customers.stream().mapToInt(Customer::getAge);
		intStream.forEach(System.out::println);
		
	}

}
