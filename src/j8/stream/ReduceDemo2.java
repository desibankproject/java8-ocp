package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo2 {
	
	public static void main(String[] args) {
	  	List<String>  strings=Arrays.asList("duck","chicken","flamingo","pelican");
	  	Stream<String> tstream=strings.stream();
	  	Optional<String> result=tstream.reduce((s1,s2)->s1+"**"+s2);//Binary Operator
	  	result.ifPresent(System.out::println);
	}

}
