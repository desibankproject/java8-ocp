package file.io;

import java.io.IOException;
import java.nio.file.Paths;

public class ToRealPath2 {
	public static void main(String[] args) {
		//   /zebra/food.source → /horse/food.txt
		try {
			 System.out.println(Paths.get("/zebra/food.source").toRealPath());
			 System.out.println(Paths.get(".././food.txt").toRealPath());
			} catch (IOException e) {
			 // Handle file I/O exception...
			}
	}

}
