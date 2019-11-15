package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q20 {
	public static void main(String[] args) {
		final Path patha = Paths.get(".");
		System.out.println(patha);
		final Path path = Paths.get(".").normalize(); // h1
		System.out.println(path.toAbsolutePath().getParent());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getNameCount());
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);
	}
}
