package j8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class PredicateIntermediate {
  public static void main(String[] args) {
		Stream<String> streams=Arrays.asList("Nagendra","Jhon","James","Amogh").stream();
		streams=streams.filter(t->t.length()>4);
		streams.forEach(System.out::println);
}
}
