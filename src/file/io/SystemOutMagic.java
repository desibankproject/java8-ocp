package file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemOutMagic {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("(@@(@(@(@(@(@&#");
		
		File file=new File("D:/andy.txt");
		PrintStream printStream=new PrintStream(file);
		//System.out - will point to printStream - this point to file
		System.setOut(printStream);
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		System.out.println("Ahahahahahah8273734t734t4");
		
	}
}
