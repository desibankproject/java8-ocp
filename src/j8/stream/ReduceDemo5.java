package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo5 {
	public static void main(String[] args) {
	  	List<String>  strings=Arrays.asList("duck","chicken","flamingo","pelican");
	  	Stream<String> tstream=strings.parallelStream();
	  	//String result=tstream.reduce("Mr. ",(s1,s2)->s1+"**"+s2);//Binary Operator
	  	String result=tstream.reduce("Mr. ",(s1,s2)->s1+"**"+s2,(s1,s2)->s1+"%%"+s2);
	  	System.out.println(result);
	}
}
