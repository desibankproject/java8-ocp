package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesDemo {

	public static void main(String[] args) {
		Path path = Paths.get("D:/jocker.txt");
		try {
		 final List<String> lines = Files.readAllLines(path);
		 for(String line: lines) {
		 System.out.println(line);
		 }
		} catch (IOException e) {
		 // Handle file I/O exception...
		}
	}
}
