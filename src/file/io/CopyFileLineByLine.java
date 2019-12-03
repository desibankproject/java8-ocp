package file.io;

import java.io.*;

public class CopyFileLineByLine {
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source);BufferedInputStream bufferedInputStream=new BufferedInputStream(in); OutputStream out = new FileOutputStream(destination);BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(out)) {
			byte b[]=new byte[1024];
			while (bufferedInputStream.read(b) != -1) {
				bufferedOutputStream.write(b, 0, b.length);
				out.flush();
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
