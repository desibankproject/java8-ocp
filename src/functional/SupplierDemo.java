package functional;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		   /* Supplier<Person> supplier=()-> {
	            return new Person("Varun", 30, "Programmer");
	        };*/
	        
			//Supplier<Person> supplier=()->new Person("Varun", 30, "Programmer");
			Supplier<Person> supplier=Person::new;
	        Person p = supplier.get();
	        System.out.println(p);
	}
}
