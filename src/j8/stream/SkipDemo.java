package j8.stream;

import java.util.stream.Stream;

public class SkipDemo {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->++i); //1 2 3 4 5 6 7 8 9 10 11
    	 Stream<Integer> tstream=stream.map(i->i*2);////2 4 6 8 10
    	 tstream=tstream.limit(10).skip(3);
    	 System.out.println(tstream);
    	 tstream.forEach(System.out::println);
     }
}