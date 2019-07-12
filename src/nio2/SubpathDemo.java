package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubpathDemo {
	public static void main(String[] args) {
		Path path=Paths.get("/root/home/tomcat/bin");
		//in subpath / is not coming 
		Path spath=path.subpath(0, 3);
		System.out.println(spath);
		
		Path spath2=path.subpath(2,4);
		System.out.println(spath2);
		
		//IllegalArgumentException
		Path spath4=path.subpath(3,3);
		System.out.println(spath4);
		
		//IllegalArgumentException
		Path spath3=path.subpath(2,5);
		System.out.println(spath3);
		
	}
}
