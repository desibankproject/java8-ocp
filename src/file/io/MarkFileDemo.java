package file.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkFileDemo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("nky.txt");
		System.out.print((char) is.read());
		if (is.markSupported()) {
			is.mark(100);
			System.out.print((char) is.read());
			System.out.print((char) is.read());
			is.reset();
		}
		System.out.print((char) is.read());
		System.out.print((char) is.read());
		System.out.print((char) is.read());
	}
}
