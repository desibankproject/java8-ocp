package file.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	
	public static void main(String[] args) {
		File file=new File("D:/jocker.txt");
		if(file.exists()) {
			System.out.println("@)@()@");
		}
		Path p=file.toPath();
		
		Path path=Paths.get("D:","jocker.txt");
		boolean b=Files.exists(path);
		System.out.println("b = "+b);
		File f=path.toFile();
		
	}
	
}
