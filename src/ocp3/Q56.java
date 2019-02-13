package ocp3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q56 {
	
	public static void main(String[] args) {
		Path path =Paths.get("/animals");
		boolean myBoolean = Files.walk(path)
		.filter((p,a) -> a.isDirectory()&& !path.equals(p)) // w1
		.findFirst().isPresent(); // w2
		System.out.println(myBoolean ?"No Sub-directory": "Has Sub-directory");
	}

}
