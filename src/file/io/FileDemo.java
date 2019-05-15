package file.io;

import java.io.File;
import java.io.InputStream;

public class FileDemo {
	public static void main(String[] args) {
		Path
		File file=new File("D:/HelloMe.java");
		if(file.exists()){
			System.out.println("@)@)@Yes it is there!!??");
		}
		System.out.println(")@)@)@");
		
		File director=new File("D:/thread2/src/conncurrent");
		if(director.isDirectory()){
			String files[]=director.list();
			for(String f:files){
				System.out.println(f);
			}
		}
	}
}
