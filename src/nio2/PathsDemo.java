package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {
	public static void main(String[] args) {
		Path path=Paths.get("/root/tomcat/bin/startup.sh");
		System.out.println(path.getRoot());
		System.out.println(path);
		System.out.println(path.getParent());
		System.out.println(path.getParent().getParent());
		System.out.println(path.getParent().getParent().getParent());
		System.out.println(path.getParent().getParent().getParent().getParent());
		System.out.println(path.getParent().getParent().getParent().getParent().getParent());
	}

}
