package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q41 {
	public static void main(String[] args) {
		 String currentDirectory = System.getProperty("user.dir");
		 System.out.println(currentDirectory);
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		//	//user/home/bear
		Path cdir=Paths.get(".");
		System.out.println(cdir.toAbsolutePath());
		Path spath=path.subpath(1,3).getName(1);
		System.out.println(spath);
		System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());
	}
}
