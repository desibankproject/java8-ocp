package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		   Path path3=Paths.get("D:/duy/Q4.java");
		   Files.delete(path3);
	}
}
