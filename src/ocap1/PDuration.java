package ocap1;

import java.time.Duration;
import java.time.Period;
import java.util.Set;
import java.util.TreeSet;

public class PDuration {
public static void main(String[] args) {
	Set<? extends RuntimeException> set =new TreeSet<NullPointerException>();
	String d = Duration.ofDays(1).toString();
	String p = Period.ofDays(1).toString();
	System.out.println(d);
	System.out.println(p);
	boolean b1 = d == p;
	boolean b2 = d.equals(p);
	System.out.println(b1 + " " + b2);
}
}
