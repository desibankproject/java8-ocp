package j8.thread;

import java.util.Arrays;

public class Q10 {
		public static void main(String[] args) {
			System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
					.parallelStream().parallel() // q1
					.reduce("0",
					(c1, c2) -> c1.length() + c2.length()+"", // q2
					(s1, s2) -> s1 + s2)); // q3
		    }
}
