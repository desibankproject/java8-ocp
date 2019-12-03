package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectTerminalOperation {

public static void main(String[] args) {
	  List<String> list=Arrays.asList("Nomata","Vickky","Robert","Jocker","Pea");
	  Stream<String> stream=list.stream();
	 // List<String> list=stream.collect(Collectors.toList());
	  Set<String> strings=stream.collect(Collectors.toSet());
}
	
}
