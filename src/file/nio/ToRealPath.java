package file.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPath {

	public static void main(String[] args) {
		Path path=Paths.get("C:/nagendra/home/tempa/../../omega././../hello/name.txt");
		System.out.println(path.toAbsolutePath().normalize());
		System.out.println(path);
		//C:/nagendra/hello/name.txt
		Path npath=null;
		try {
			System.out.println(Paths.get(".").toAbsolutePath().normalize());
			System.out.println(Paths.get(".").toRealPath()); 
			npath = path.toRealPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(npath);
		
	}
	
	
}
