package j8.stream;

import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		  Stream<String> streams=Stream.of("Nomata","Vickky","Robert","Jocker","Pea");
		  Stream<String>  fstream=streams.filter(t->t.contains("o"));
		  fstream.forEach(s->System.out.println(s));
		  System.out.println(fstream.count());
		  //  System.out.println(fstream.count()); //it is both ...every reduction operation
		  //is terminal operation and vice-versa is not true
		 /// System.out.println(fstream.count());
	}
}
