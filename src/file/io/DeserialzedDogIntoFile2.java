package file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialzedDogIntoFile2 {
	
	public static void main(String[] args) throws Exception {
		File file=new File("d:/dog.txt");
		try(FileInputStream fileOutputStream=new FileInputStream(file);
				ObjectInputStream objectInputStream=new ObjectInputStream(fileOutputStream);){
			Dog d1=(Dog)objectInputStream.readObject();
			Dog d2=(Dog)objectInputStream.readObject();
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("Both dog is deserialized!!!!");
		}
		
	}

}
