package file.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFileExample2 {

    public static void main(String... args) throws IOException {
    	try {
    		// System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"),
    		 //Paths.get("/user/home/snake")));  
    		 System.out.println(Files.isSameFile(Paths.get("D:/temp/nagu/../jocker.txt"),
    		 Paths.get("D:/temp/jocker.txt")));  
    		 System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"),
    		 Paths.get("/leaves/giraffe.exe")));  
    		 System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"),
    		 Paths.get("/cardinal/tail.data")));
    		 } catch (IOException e) {
    		 // Handle file I/O exception...
    			 e.printStackTrace();
    		 } 
    }
}