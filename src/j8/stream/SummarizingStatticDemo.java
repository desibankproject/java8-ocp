package j8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarizingStatticDemo {

	public static void main(String[] args) {
		
		IntStream ints=IntStream.of(12,10,40,80,2,55,9);
		IntSummaryStatistics stats = ints.summaryStatistics();
		 if (stats.getCount() == 0) throw new RuntimeException();
		 int result=stats.getMax()-stats.getMin();
		 System.out.println(result);
	}
}
