package j8.stream;

import java.util.stream.Stream;

public class CountTerminalOps {
		public static void main(String[] args) {
			Stream<String> s=Stream.of("monkey","gorilla","bonobo");
			System.out.println(s.count());
		}
}
