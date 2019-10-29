package generics;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

class Guava implements Comparable<Guava> {
	
	
	private int mid;
	public Guava(int mid) {
		super();
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Guava [mid=" + mid + "]";
	}

	@Override
	public int compareTo(Guava o) {
		return mid-o.mid;
	}
	
	
}

public class MaximumTest{
	
	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T gotMax(T x, T y, T z) {
		T max = x; // assume x is initially the largest
		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}
		if (z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}
	//Integer
	public static void main(String args[]) {
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
				gotMax(3, 4, 5));
		System.out.printf("Maxm of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8,
				7.7, gotMax(6.6, 8.8, 7.7));
		System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple",
				"orange", gotMax("pear", "apple", "orange"));
		
		System.out.print(gotMax(new Guava(100),new Guava(200), new Guava(50)));
	}
}