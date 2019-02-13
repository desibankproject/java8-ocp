package ocp3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q50 {
	public static void main(String[] args) {
		Path path =Paths.get("/user/.././root","../kodiacbear.txt");
		Path pk=path.normalize().relativize(Paths.get("/lion"));
		System.out.println(path);
		System.out.println(pk);
	}
}
