package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileDemo {

    public static void main(String... args) throws IOException {
    		
    		  Path source=Paths.get("D:/temp/nagu/../jocker.txt");
    		  Path target=  Paths.get("D:/temp/mock.txt");
    		  Files.copy(source, target);
    		  System.out.println("File is copied!!");
    		  
    }
}