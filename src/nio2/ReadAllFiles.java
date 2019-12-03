package nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadAllFiles {
	 public static void main(String[] args) throws IOException {
		 
		   File file=new File("D:/yesha");
		   File[] files=file.listFiles();
		 
		    Path path=Paths.get("D:/yesha");
			Stream<Path> paths=Files.list(path); 
			paths.forEach(System.out::println);
	 }
}
