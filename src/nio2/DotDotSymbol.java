package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DotDotSymbol {
	public static void main(String[] args) {
		Path path=Paths.get("/root/./././././tomcat/../bin/../startup.sh");
		System.out.println(path);
		System.out.println(path.normalize()); 
		
	}
}
