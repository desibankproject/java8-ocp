package j8.thread;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class wewer {
	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
		String m2 = Duration.ofMinutes(1).toString();
		System.out.println(m1);
		System.out.println(m2);
		String s = Duration.of(60, ChronoUnit.SECONDS).toString();
		System.out.println(s);
		int epochSeconds=100;
		Instant.ofEpochSecond(epochSeconds);
		String d = Duration.ofDays(1).toString();
		System.out.println(d);
		String p = Period.ofDays(1).toString();
		System.out.println(p);
		System.out.println( );
	}
}
