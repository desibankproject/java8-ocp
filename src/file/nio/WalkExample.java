package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WalkExample {

	public static void main(String[] args) {
		Path path = Paths.get("D:\\java8-ocp-master\\java8-ocp-master");
		try {
		 final Stream<Path> paths = Files.walk(path);
		 paths.forEach(s->{
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(s);
		 });
		
		} catch (IOException e) {
		 // Handle file I/O exception...
		}
	}
}
