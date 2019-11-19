package file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
		try(FileWriter fileWriter=new FileWriter("D:/magic.txt");BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hello Like Java Programming!!!!!!!!!!!!!!!!!!!");
			
		}
	}
}
