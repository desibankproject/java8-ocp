package file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingContentOfFile {
      public static void main(String[] args) throws IOException, InterruptedException {
		File file=new File("D:/ORM/Assertions.java");
		if(file.exists()) {

			try(FileReader fileReader=new FileReader(file);BufferedReader bufferedReader=new BufferedReader(fileReader);){
				   String str="";
				   while((str=bufferedReader.readLine())!=null) {
					   System.out.println(str);
					   Thread.sleep(2000);
				   }
			}
			
		}else {
			System.out.println("Sorry!!!!!!!!");
		}
	}
}
