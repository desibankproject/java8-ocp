package j8.stream;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo1 {
    public static void main(String[] args) {
    	Stream<String> stream = Stream.of("w", "o", "l", "f");
    	StringBuilder word = stream.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append);
    	System.out.println(word);
    	
    	
    	Stream<String> stream1 = Stream.of("w", "o", "l", "f");
    	TreeSet<String> set = stream1.collect(TreeSet::new, TreeSet::add,
    	TreeSet::addAll);
    	System.out.println(set); // [f, l, o, w]
    	
    	
    	Stream<String> stream3 = Stream.of("w", "o", "l", "f");
    	 TreeSet<String> set2 = stream3.collect(Collectors.toCollection(TreeSet::new));
    	 System.out.println(set2); // [f, l, o, w] 
    	 
    	 Stream<String> stream4 = Stream.of("w", "o", "l", "f");
    	 List<String> list = stream3.collect(Collectors.toList());
    	 System.out.println(list); // [f, l, o, w] 
	}
}
