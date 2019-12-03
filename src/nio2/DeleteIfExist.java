package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteIfExist {
	public static void main(String[] args) throws IOException {
		   Path path3=Paths.get("D:/duy/Q4.java");
		   boolean b=Files.deleteIfExists(path3);
		   System.out.println(b);
	}
}
