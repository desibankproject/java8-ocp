package file.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderLineMain2 {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();
		try (BufferedInputStream bufferedReader = new BufferedInputStream(
				new FileInputStream(new File("D:/thread2/src/conncurrent/AtomicIntegerExample.java")))) {
			byte[] line= {};
			/*while(bufferedReader.read(line)>0){
				list.add(line);
			}
			*/
			list.forEach(System.out::println);

		}
	}
}
