import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvesionDemo {
	public static void main(String[] args) {
		Stream<List<Integer>> istrem=Stream.of(Arrays.asList(1,2),Arrays.asList(10,4));
		IntStream intStream=istrem.flatMapToInt(x->x.stream().mapToInt(i->i));
		
	}
}
