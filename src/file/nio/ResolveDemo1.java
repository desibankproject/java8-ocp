package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveDemo1 {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:/root/home/apache2.0");
		Path p2 = Paths.get("home/mocha");
		Path p3 = p1.resolve(p2);
		System.out.println(p3); // C:/root/home/apache2.0/home/mocha
		
		Path p4 = p2.resolve(p1);
		System.out.println(p4); // C:/root/home/apache2.0

	}
}
