package functional;

import java.util.function.Consumer;

public class NewConfusion {
	
	public static void main(String[] args) {
		Consumer<Person> consumer=Person::new;
		consumer.accept(new Person("Nagendra",12,"Noida"));	
	}
	
	

}
