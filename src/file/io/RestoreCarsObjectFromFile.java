package file.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RestoreCarsObjectFromFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File file=new File("D:/harini.txt");
		
		try(FileInputStream fileInputStream=new FileInputStream(file);
				BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
				ObjectInputStream objectInputStream=new ObjectInputStream(bufferedInputStream)){
			Car car1=(Car)objectInputStream.readObject();
			Car car2=(Car)objectInputStream.readObject();
			Car car3=(Car)objectInputStream.readObject();
			System.out.println("Thanks following objects are restored from  the files");
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
			
		}
		
		
	}
}
