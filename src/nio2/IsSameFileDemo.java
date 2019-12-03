package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFileDemo {
	public static void main(String[] args) throws IOException {
		   Path path3=Paths.get("D:/duy1/Q4.java");
		   Path path4=Paths.get("D:/duy1/Q4.java");
		   boolean bool=Files.isSameFile(path3, path4) ;
		   System.out.println(bool);
		
		   Path path1=Paths.get("D:/duy1/Q4.java");
		   Path path2=Paths.get("D:/duy1/java/../Q4.java");
		   boolean bool1=Files.isSameFile(path1, path2) ;
		   System.out.println(bool1);
	}
}
