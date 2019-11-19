package file.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindDemo {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\\\java8-ocp-master\\\\java8-ocp-master");
		long dateFilter = 1420070400000l;
		try {
		 Stream<Path> stream = Files.find(path, 10,
		 (p,a) -> p.toString().endsWith(".java")
		 && a.lastModifiedTime().toMillis()>dateFilter);
		 stream.forEach(System.out::println);
		} catch (Exception e) {
		 // Handle file I/O exception...
		}
	}
}
