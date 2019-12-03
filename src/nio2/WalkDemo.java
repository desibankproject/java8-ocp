package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkDemo {

	public static void main(String[] args) throws IOException {
		   Path path=Paths.get("D:/yesha");
			Stream<Path> paths=Files.walk(path); 
			paths.forEach(System.out::println);
	}
}
