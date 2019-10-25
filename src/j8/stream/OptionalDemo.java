package j8.stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 
 * @author Nagendra
 *
 */
public class OptionalDemo {
	public static void main(String[] args) {
	    Stream<String> streams=Stream.of("Nomata","Vickky","Robert","Jocker","Pea");
	    Optional<String> output=streams.min((s1,s2)->s1.length()-s2.length());
	    
	    if(output.isPresent()) {
	    	  String max=output.get();
	    }else {
	    	
	    }
	    
	    output.ifPresent(System.out::println);
	    
	    if(output.isPresent()){
	    	System.out.println(output.get());
	    }
	    
	    Optional<?> poutput=Stream.empty().min((s1,s2)->0);
	    //if(poutput.isPresent()){
	    	System.out.println(poutput.get());
	    //}
	}
}
