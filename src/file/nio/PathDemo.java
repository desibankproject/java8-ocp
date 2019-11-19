package file.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	//Files
	public static void main(String[] args) {
		     //Path has support of soft link while does not
		     Path path=Paths.get("D:/jocker.txt");
		     System.out.println(path);
		     
		     Path path1=Paths.get("D:","jocker.txt");
		     System.out.println(path1);
		     
		    File file=path1.toFile();
		    Path p=file.toPath();
		    System.out.println(p);
	}
}
