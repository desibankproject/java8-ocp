package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathDemo {
	public static void main(String[] args) {
		// FileSystems.getDefault().getPath("logs", "access.log");
		Path path=Paths.get("logs", "sleep.txt");
		System.out.println(path);
		System.out.println(path.toFile().exists());
	}
}
