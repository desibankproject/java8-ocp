package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeDemo {
public static void main(String[] args) {
	Path path3 = Paths.get("E:/habitat");
	Path path4 = Paths.get("E:\\sanctuary\\raven");
	System.out.println(path3.relativize(path4));//../sanctuary/raven
	System.out.println(path4.relativize(path3));
	System.out.println(path3);
}
     public static void main(String[] args) {
    	 Path path1 = Paths.get("fish.txt");
    	 Path path2 = Paths.get("birds.txt");
    	 System.out.println(path1.relativize(path2)); // ..\birds.txt
    	 System.out.println(path2.relativize(path1)); //..\fish.txt
	}
}
