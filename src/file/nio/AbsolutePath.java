package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsolutePath {
	public static void main(String[] args) {
       Path path=Paths.get("pock/jock/temp");
       System.out.println("is it absolute  = "+path.isAbsolute());
       Path ap=path.toAbsolutePath();
	   System.out.println(ap);
	   System.out.println(ap.getRoot());
	}
}
