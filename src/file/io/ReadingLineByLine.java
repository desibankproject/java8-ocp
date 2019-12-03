package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLineByLine {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("D:/jocker.txt");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());

		try (FileReader fileReader = new FileReader(file);BufferedReader bufferedReader=new BufferedReader(fileReader)) {
			String line =null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				Thread.sleep(200);
			}
		}
	}
}
