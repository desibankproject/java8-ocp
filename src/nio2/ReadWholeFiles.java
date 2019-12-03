package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadWholeFiles {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("D:/duy/Q4.java");
		List<String> lines=Files.readAllLines(path);
		lines.forEach(System.out::println);
	}
}
