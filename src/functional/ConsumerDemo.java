package functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
		public static void main(String[] args) {
			Consumer<String>  c=(t) -> 	System.out.println(t);
			Consumer<String>  c2 =System.out::println;
			Consumer<String> consumerStr1= s->{
				System.out.println(s);
			};
			Consumer<String> consumerStr2=System.out::println;
			consumerStr1.accept("Hello Java.");
			consumerStr2.accept("Hello World.");
		}
}
