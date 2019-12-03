import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Copies {
	public static void main(String[] args) {
		try {
			Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
			Files.move(Paths.get("c:\\user\\addresses.txt"),
			Paths.get("c:\\zoo-new"));
			} catch (IOException e) {
			// Handle file I/O exception...
				e.printStackTrace();
			}
	}
}
