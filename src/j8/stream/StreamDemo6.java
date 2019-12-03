package j8.stream;

import java.util.stream.Stream;

public class StreamDemo6 {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->i++); //1 1 1 1 1 1 1 1 1 1 1
    	 Stream<Integer> tstream=stream.map(i->i*2);
    	 System.out.println(tstream);
     }
}