package file.io;

import java.io.*;

public class CopyFileSample {
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("D:/jocker.txt");
		File destination = new File("D:/owow.txt");
		copy(source, destination);
		System.out.println("File is copied successfully to "+destination.getAbsolutePath());
	}
}
