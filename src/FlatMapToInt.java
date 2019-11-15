import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToInt {

	public static void main(String[] args) {
		Stream<List<String>> stream=Stream.of(Arrays.asList("12","14","5"),Arrays.asList("1","2","3"));
		IntStream intStream=stream.flatMapToInt(list->list.stream().mapToInt(Integer::parseInt));
		//IntStream intStream=stream.flatMapToInt(list->list.stream().mapToInt(Integer::parseInt));
		intStream.forEach(System.out::print);
	}
}
