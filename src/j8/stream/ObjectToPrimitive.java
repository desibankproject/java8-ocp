package j8.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		//This is Object Stream!
		Stream<String> streams=Stream.of("10","20","30","50");
		IntStream intStream=streams.mapToInt(s->Integer.parseInt(s));
		OptionalDouble optionalDouble=intStream.average();
		double average=optionalDouble.getAsDouble();
		System.out.println(average);
		//int sum=intStream.sum();
		
	}
}
