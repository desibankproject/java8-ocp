package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderLineMain {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(new File("D:/thread2/src/conncurrent/AtomicIntegerExample.java")))) {
			String line="";
			while((line=bufferedReader.readLine())!=null){
				list.add(line);
			}
			
			list.forEach(System.out::println);

		}
	}
}
