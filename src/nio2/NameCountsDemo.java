package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NameCountsDemo {
	public static void main(String[] args) {
		Path p=Paths.get("tomcat");
		Path path=Paths.get("/root/tomcat/bin/startup.sh");
		//getFileName
		//Returns the name of the file or directory denoted by this path as a object
		System.out.println("file Name is = "+path.getFileName());
		int nameCounts=path.getNameCount();
		System.out.println(nameCounts);
		System.out.println("finally printing all");
		for(int x=0;x<nameCounts;x++) {
			Path element=path.getName(x);
			System.out.println(element);
		}
	}
}
