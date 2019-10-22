package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;

public class PipeLineDemo {

	public static void main(String[] args) {
		/*
		 * Stream<String> streams=Stream.of("Nomata","Vickky","Robert","Jocker","Pea");
		 */
		List<String> list=Arrays.asList("Nomata","Vickky","Robert","Jocker","Pea");
		Stream<String> streams=list.stream();
		//Function
		//Function<String,String> fddd=(String t) ->new StringBuilder(t).reverse().toString();
		Stream<String> t1=streams.map(s->s.toUpperCase());
		Stream<String> t2=t1.map( s->new StringBuilder(s).reverse().toString());
		Stream<String> t3=t2.filter(s->s.length()>3);
		t3.forEach(s->System.out.println(s));
		  
	}
}
