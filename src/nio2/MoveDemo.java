package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveDemo {
	public static void main(String[] args) throws IOException {
		   Path path3=Paths.get("D:/duy");
		   Path path4=Paths.get("D:/hadoop"); //shallow copy
		   Path path=Files.move(path3, path4,StandardCopyOption.REPLACE_EXISTING) ;
/*		   Path path=Files.copy(path3, path4,StandardCopyOption.REPLACE_EXISTING) ;
*/		   System.out.println(path);
	}
}
