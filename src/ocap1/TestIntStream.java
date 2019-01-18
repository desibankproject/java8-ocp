package ocap1;

import java.util.stream.IntStream;

public class TestIntStream {
	public static void main(String[] args) {
		IntStream.iterate(1, i -> i+1) // u2
		.limit(12)
		.forEach(i->System.out.println(i)); // u4
	}
}
