package nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) throws IOException {
			File file=new File("D:/duy/Q4.java");
		   System.out.println(file.length());
		   long size=Files.size(Paths.get("D:/duy/Q4.java"));
		   System.out.println(size);
		   
	}
}
