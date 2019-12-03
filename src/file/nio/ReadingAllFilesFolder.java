package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingAllFilesFolder {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\java8-ocp-master\\java8-ocp-master");
		try {
		 final Stream<Path> paths = Files.list(path);
		 paths.forEach(System.out::println);
		
		} catch (IOException e) {
		 // Handle file I/O exception...
		}
	}
}
