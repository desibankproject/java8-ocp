package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {

	public static void main(String[] args) {
		List<String>  list=Arrays.asList("Nagendra","Jack","Back","Dad","Chat","Champ");
		
		Stream<String>  stream=Stream.empty();
		Map<Boolean,List<String>>  maps=list.stream().collect(Collectors.groupingBy(s->s.length()>4));
		System.out.println(maps);//[]
	}
}
