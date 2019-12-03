package j8.stream;

import java.util.stream.Stream;

public class CreateStream2 {

	public static void main(String[] args) {
		Stream<String> streams=Stream.of("Nagendra","Maks","Jacks","Oeueue");
	    System.out.println(streams);
		Stream<String> fstream=streams.filter(t->t.length()>5);
		System.out.println(fstream);
		fstream.forEach(System.out::println);
	}
	
}
