package method.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		List<String> fruitList=new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Grapes");
		Stream<String>  stream1=fruitList.stream();
		Stream<String>  stream2=stream1.map(t->t.toUpperCase());
		System.out.println(stream2);
		System.out.println(stream1);
	}
}
