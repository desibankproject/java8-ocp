package oca8;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CommandLineArgs {
	public static void main(String[] main) {
		
		 Path p1 = Paths.get("c:\\temp\\test1.txt");
	        Path p2  = Paths.get("c:\\temp\\test2.txt");
		try(Path p=Files.move(p1, p2)){
			
		}
		
		//Hey this is my java program
		/**
		 * ddddddddddddddddddd
		 * dddddddddddd
		 * ddddddddddd
		 * ddddddddd
		 * dddddddddd
		 * d 
		 */
		int len=main.length;
		if(len==0) {
			System.out.println("Sorry not input is passed ..");
			return; //means return the control from this method
		}
		for(int x=0;x<len;x++) {
			System.out.println(main[x]);
		}
	}
}
