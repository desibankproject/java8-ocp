package file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteDateIntoFile {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=scanner.nextLine();
		File file=new File("D:/Reetu.txt");
		try(FileWriter writer=new FileWriter(file,true);BufferedWriter bw=new BufferedWriter(writer);){
			bw.write(name+"\n");
			bw.write(name+"\n");
			bw.write(name+"\n");
			bw.write(name+"\n");
			bw.write(name+"\n");
		}catch (Exception e) {

		}
		
	}

}
