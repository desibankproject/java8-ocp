package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeDemo3 {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:/root/home/apache2.0");
		Path p2 = Paths.get("/root/home/mocha");
		Path p3 = p1.relativize(p2);
		System.out.println(p3); // ../mocha

	}
}
