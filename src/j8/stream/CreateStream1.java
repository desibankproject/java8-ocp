package j8.stream;

import java.util.stream.Stream;

public class CreateStream1 {

	public static void main(String[] args) {
		Stream<String> streams=Stream.of("Nagendra","Maks","Jacks","Oeueue");
		System.out.println(streams);
		Stream<String> bb=streams;
		streams.forEach((String t)->System.out.println(t));
		bb.forEach((String t)->System.out.println(t));
	}
	
}
