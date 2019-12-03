package j8.stream;

import java.util.stream.Stream;

public class PeekStreamDemo {
     public static void main(String[] args) {
    	 Stream<Integer> stream = Stream.iterate(1,i->++i); //1 1 1 1 1 1 1 1 1 1 1
    	 Stream<Integer> tstream=stream.map(i->i*2);
    	 Stream<Integer> stream2=tstream.limit(50).peek(s->System.out.println("Peek with "+s));
    	 Stream<Integer> stream3 =stream2.skip(5);
    	 System.out.println(stream3);
    	 System.out.println("@)@)@)@Pinting the data(@(@@*@");
    	 stream3.forEach(System.out::println);
     }
}