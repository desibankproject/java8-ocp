package functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinTerminalOperationMain {
	
	 //Optional	
	 public static void main(String[] args) {
		    List<String> heros=new ArrayList<>();
		    heros.add("");
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Mocks");
			Stream<String> list=heros.stream();
			list.count();
			
			Comparator<String> comparator=(String s1,String s2)->s1.length()-s2.length();
			Optional<String> op=list.min(comparator);
			op.ifPresent(System.out::println);
			/*if(op.isPresent()){
				System.out.println("@@)@)@");
				System.out.println(op.get());
			}*/
			
	}
}
