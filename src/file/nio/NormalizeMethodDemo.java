package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeMethodDemo {

	public static void main(String[] args) {
		
		Path path=Paths.get("C:/nagendra/home/tempa/../../omega././../hello/name.txt");
		System.out.println(path);
		//C:/nagendra/hello/name.txt
		Path npath=path.normalize();
		System.out.println(npath);
		
	}
	
	
}
