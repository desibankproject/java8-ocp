package nio2;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToREalPath {
	public static void main(String[] args) throws IOException {
		Path path=Paths.get("/root/tomcat/bin/startup.sh");
		if(path.isAbsolute()) {
			System.out.println("Hey this path is absolute path = "+path);
		}else {
			System.out.println("Hey this path is not absolute path = "+path);
		}
		System.out.println(path.toAbsolutePath());
		
		System.out.println(path.toRealPath());
	}
}
