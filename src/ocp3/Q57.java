package ocp3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q57 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("turkey");
		System.out.println(path);
		if(Files.isSameFile(path,Paths.get("/zoo/turkey")))// x1
		Files.createDirectory(path.resolve("info"));// x2
	}
}
