package file.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeDemo {

	public static void main(String[] args) {
		Path p=Paths.get("D:/temp/nagu/../../././././jocker.txt");
		Path temp=p.normalize();
		System.out.println(temp);
	}
}
