package file.nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {


	public static void main(String[] args) {
		File file=new File("D:/jocker.txt");
		if(file.exists()) {
			System.out.println("@)@()@");
		}
		Path p=file.toPath();

		Path path=Paths.get("D:/jocker.txt");
		boolean b=Files.exists(path);

		File f=path.toFile();

	}

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
