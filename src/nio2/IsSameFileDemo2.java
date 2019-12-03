package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFileDemo2 {
	public static void main(String[] args) throws IOException {
		   Path path=Paths.get("D:/duy1/Q4.java");
		   Path path2=Paths.get("D:/duy1/Q4.java");
		   Path path3=Paths.get("D:/duy1/riggi/Q4.java");
		   boolean bool1=Files.isSameFile(path, path2) ;
		   System.out.println(bool1);
		  boolean boo2=Files.isSameFile(path2, path3) ;
		  System.out.println(boo2);
	}
}
