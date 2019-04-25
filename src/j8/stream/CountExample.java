package j8.stream;

import java.util.stream.Stream;

public class CountExample {
	
	public static void main(String[] args) {
		  Stream<String> streams=Stream.of("Nomata","Vickky","Robert","Jocker","Pea");
		  System.out.println(streams.count());
	}

}
