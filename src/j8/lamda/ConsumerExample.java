package j8.lamda;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apple","Guava","Banana","Pine Apple","Grapes");
		fruits.stream().forEach(item->{
			System.out.println(item);
		});
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fruits.forEach(item->{
			System.out.println(item);
		});
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fruits.forEach(c->System.out.println(c));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		fruits.forEach(System.out::println);
	}
}
