import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListDemo {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(5,10,15,4);
		IntSummaryStatistics intSummaryStatistics=integers.stream().collect(Collectors.summarizingInt(i->i+i));
		System.out.println(intSummaryStatistics.getSum());
		System.out.println(intSummaryStatistics.getAverage());
		System.out.println(intSummaryStatistics.getMax());
		System.out.println(intSummaryStatistics.getMin());
	}
}
