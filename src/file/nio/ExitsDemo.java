package file.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExitsDemo {

	public static void main(String[] args) {
		Path path=Paths.get("D:/jocker.txt");
		boolean b=Files.exists(path);
		System.out.println("b = "+b);
		
		File file=new File("D:/jocker.txt");
		boolean ue=file.exists();
		System.out.println(file.exists());
		Path p=file.toPath();
		System.out.println(p);
	}
}
