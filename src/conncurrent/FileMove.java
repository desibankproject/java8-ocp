package conncurrent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("D:/green.txt");
		Path target = Paths.get("D:/colors/yellow.txt");
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
		Files.delete(source);
		System.out.println("@(@*@**@hmmm");
	}
}
