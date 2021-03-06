package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListDemo {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\temp");
		 try {
		 Stream<Path> streams=Files.list(path);
		// streams.forEach(System.out::println);
		  streams.filter(p -> p.toString().endsWith(".pdf"))
		 .forEach(System.out::println);
		 } catch (IOException e) {
		 // Handle file I/O exception...
		 } 
	}
}
