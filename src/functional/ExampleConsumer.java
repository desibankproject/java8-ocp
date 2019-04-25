package functional;

import java.util.ArrayList;
import java.util.List;

public class ExampleConsumer {
	public static void main(String[] args) {
		List<String> heros=new ArrayList<>();
		heros.add("Robert");
		heros.add("Jack");
		heros.add("Maks");
		//Consumer<String> consumer=System.out::println;
		/*Consumer<String> consumer=new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};*/
		heros.forEach(System.out::println);
	}
}
