package j8.stream;

import java.util.stream.Stream;

public class LimitStreamDemo7 {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->++i); //1 1 1 1 1 1 1 1 1 1 1
    	 Stream<Integer> tstream=stream.map(i->i*5);
    	 tstream=tstream.limit(10);
    	 tstream.forEach(System.out::println);
     }
}