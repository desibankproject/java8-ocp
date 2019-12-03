package file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Hello to console!!");
		File file=new File("D:/jocker.txt");
		System.setOut(new PrintStream(file));
		System.out.println("Hello now content will go inside kwwwiow");
		System.out.println("Hello now content will go inside kwwwiow");
		System.out.println("Hello now content will go inside kwwwiow");
		System.out.println("Hello now content will go inside kwwwiow");
		System.out.println("Hello now content will go inside kwwwiow");
		
	}
}
