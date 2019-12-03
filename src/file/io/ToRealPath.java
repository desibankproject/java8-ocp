package file.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPath {
	
	public static void main(String[] args) {
		Path p=Paths.get("test\\\\///////////ola.txt");
		boolean b=p.isAbsolute();
		System.out.println("is this path absolute ??? "+b);
		System.out.println(p);
		try {
			System.out.println(p.toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
