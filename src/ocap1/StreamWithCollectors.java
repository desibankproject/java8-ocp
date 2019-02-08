package ocap1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamWithCollectors {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
		        new Book("AtlasShrugged", 10.0),
		        new Book("Freedom atMidnight", 5.0),
		        new Book("Gone with thewind", 5.0)
		);
		Map<String, Double> bookMap = books.stream().
				collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice()));
		BiConsumer<String, Double> func = (a, b)->{
            if(a.startsWith("A")){
                System.out.println(b);
            }
        };
        
        /*The method forEach(BiConsumer<? super String,? super Double>) 
        in the type Map<String,Double> is not applicable for the arguments
        (Consumer<Map.Entry<String,Double>>)
        */  Consumer<Map.Entry<String, Double>> func1 = (e)->{
            if(e.getKey().startsWith("A")){
                System.out.println(e.getValue());
            }
    };
		bookMap.forEach(func);
	}

}
