package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q6 {
	public static void main(String[] args) {
		Path path = Paths.get("D:/duy");
		try {
			Files.find(start, maxDepth, matcher, options)(path).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // w2

	}
}
