package j8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		  Stream<String> streams=Stream.of("Nomata","Vickky","Robert","Jocker","Pea");
		  Stream<String>  fstream=streams.filter(t->t.contains("o"));
		  System.out.println(fstream.count()); //it is both ...every reduction operation
		  //is terminal operation and vice-versa is not true
		  System.out.println(fstream.count());
	}

}
