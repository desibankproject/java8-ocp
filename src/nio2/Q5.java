package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q5 {
	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/Nagendra/git/java8-ocp/animals");
		Path path2 = Paths.get("animals");
		boolean myBoolean;
		try {
			Files.isSameFile(path, path2);
			System.out.println(path2);
			myBoolean = Files.walk(path).filter((p) -> !path.equals(p)) // w1
					.findFirst().isPresent();
			System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // w2
	}
}
