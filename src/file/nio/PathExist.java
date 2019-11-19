package file.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExist {

	public static void main(String[] args) {
	     //Path has support of soft link while does not
	     Path path=Paths.get("D:/temp/logic/works/jocker.txt");
	     System.out.println(path);//path.toString();
	    boolean  b=Files.exists(path);
	    System.out.println(b);
	    int  nameCounts=path.getNameCount();
	    System.out.println(nameCounts);
	}
}
