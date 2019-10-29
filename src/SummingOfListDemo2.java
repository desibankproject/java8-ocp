import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingOfListDemo2 {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(5,10,15,4);
		int sum=integers.stream().collect(Collectors.summingInt(i->i));
		System.out.println(sum);
	}
}
