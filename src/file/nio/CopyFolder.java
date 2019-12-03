package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFolder {

	public static void main(String[] args) {
		try {
			 Files.copy(Paths.get("D:/java1"), Paths.get("D:/panda-save"),StandardCopyOption.REPLACE_EXISTING);
			System.out.println("2020done!");
			 // Files.copy(Paths.get("/panda/bamboo.txt"),
			 //Paths.get("/panda-save/bamboo.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			 // Handle file I/O exception...
			}
	}
}
