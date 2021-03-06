package ocap1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeClosed {
	public static void main(String[] args) {
		Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
		Object obj = values.collect(Collectors.partitioningBy(x->x%2==0));
		System.out.println(obj);
	}
}
