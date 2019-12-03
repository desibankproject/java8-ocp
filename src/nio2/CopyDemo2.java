package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		   Path path3=Paths.get("D:/duy");
		   Path path4=Paths.get("D:/ooa"); //shallow copy
		   Path path=Files.copy(path3, path4) ;
/*		   Path path=Files.copy(path3, path4,StandardCopyOption.REPLACE_EXISTING) ;
*/		   System.out.println(path);
	}
}
