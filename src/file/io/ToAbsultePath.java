package file.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToAbsultePath {
	
	public static void main(String[] args) {
		Path p=Paths.get("test\\\\///////////ola.txt");
		boolean b=p.isAbsolute();
		System.out.println("is this path absolute ??? "+b);
		System.out.println(p);
		System.out.println(p.toAbsolutePath());
		System.out.println(Files.exists(p));
		
	}

}
