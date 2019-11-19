package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeDemo {
     public static void main(String[] args) {
    	 Path path1 = Paths.get("fish.txt");
    	 Path path2 = Paths.get("birds.txt");
    	 System.out.println(path1.relativize(path2)); // ..\birds.txt
    	 System.out.println(path2.relativize(path1)); //..\fish.txt
	}
}
