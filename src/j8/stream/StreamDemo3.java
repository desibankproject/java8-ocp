package j8.stream;

import java.util.Date;
import java.util.stream.Stream;

public class StreamDemo3 
{
     public static void main(String[] args) {
         
    	 //generate - infinite
    	 //Stream<Date> stream = Stream.generate(() -> { return new Date(); });
    	/* Stream<Date> stream = Stream.generate(() -> new Date());*/
    	 Stream<Date> stream = Stream.generate(Date::new);
         stream.forEach(System.out::println);
     }
}