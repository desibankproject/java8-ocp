package ocap1;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		 ArrayDeque<String> greetings = new ArrayDeque<String>();
		 greetings.push("hello");
		 greetings.push("hi");
		 greetings.push("ola");
		 greetings.pop();
		 greetings.peek();
		 while (greetings.peek() != null)
		 System.out.print(greetings.pop());
	}
}
