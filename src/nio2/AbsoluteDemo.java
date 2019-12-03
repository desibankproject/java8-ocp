package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsoluteDemo {
	public static void main(String[] args) {
		Path path=Paths.get("/root/tomcat/bin/startup.sh");
		
		if(path.isAbsolute()) {
			System.out.println("Hey this path is absolute path = "+path);
		}else {
			System.out.println("Hey this path is not absolute path = "+path);
		}
		System.out.println(path.toAbsolutePath());
		Path path2=Paths.get("/tomcat/bin/startup.sh");
		System.out.println(path2.toAbsolutePath());
	}
}
