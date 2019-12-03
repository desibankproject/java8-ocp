package file.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("D:/jocker.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());

		try (FileReader fileReader = new FileReader(file);) {
			int ch = 0;
			while ((ch = fileReader.read()) != -1) {
				System.out.print((char) ch);
				Thread.sleep(200);
			}
		}
	}
}
