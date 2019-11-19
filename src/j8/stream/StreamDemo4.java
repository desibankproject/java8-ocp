package j8.stream;

import java.util.stream.Stream;

public class StreamDemo4 
{
     public static void main(String[] args) {
         
    	 //generate - infinite
    	 //Stream<Date> stream = Stream.generate(() -> { return new Date(); });
    	/* Stream<Date> stream = Stream.generate(() -> new Date());*/
    	 Stream<Integer> stream = Stream.iterate(1,i->i+1); //1 2 3 4 5 6 7  
         stream.forEach(System.out::println);
     }
}