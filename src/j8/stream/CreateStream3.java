package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream3 {

	public static void main(String[] args) {
		List<String>  strings=Arrays.asList("duck","chicken","flamingo","pelican");
		Stream<String> streams=strings.stream();
		streams.forEach(System.out::println);
	}
	
}
