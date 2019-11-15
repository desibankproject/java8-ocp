package j8.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveToObject {

	public static void main(String[] args) {
		//This is Object Stream!
		IntStream intStream=IntStream.of(10,20,30,50);
		Stream<String> objStream=intStream.mapToObj(String::valueOf);
		System.out.println(objStream);
		
	}
}
