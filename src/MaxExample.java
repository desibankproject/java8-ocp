import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MaxExample {

	public static void main(String[] args) throws IOException {
		Files.move(Paths.get("D:/jaya/java8/MaxExample.java"),Paths.get("D:/jaya/MaxExample.java"), StandardCopyOption.ATOMIC_MOVE);
		//Files.delete(Paths.get("D:/jaya/java8/NagendraMaxExample.java"));
	}
}
