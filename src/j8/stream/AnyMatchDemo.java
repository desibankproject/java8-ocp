package j8.stream;

import java.util.stream.Stream;

public class AnyMatchDemo {
	public static void main(String[] args) {
		Stream<String>  stream=Stream.of("Nagendra","James","Aaron","Jack");
		boolean b=stream.anyMatch(s->s.length()>5);
		System.out.println(b);
		
		Stream<String>  names=Stream.generate(()->"Andy");
		boolean c=names.anyMatch(s->s.length()>5);
		System.out.println(c);
	}
}


