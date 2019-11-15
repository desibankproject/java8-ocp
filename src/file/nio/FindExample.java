package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class FindExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\java8-ocp-master\\java8-ocp-master");
		Stream<Path> paths=Files.find(path, 2,(p,a)->{
			try {
				return Files.size(p)>0;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		});
		paths.forEach(System.out::println);
	}
}
