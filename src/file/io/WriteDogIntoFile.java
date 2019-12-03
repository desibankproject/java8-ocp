package file.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteDogIntoFile {
	
	public static void main(String[] args) throws Exception {
		File file=new File("d:/dog.txt");
		try(FileOutputStream fileOutputStream=new FileOutputStream(file);
				BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(bufferedOutputStream);){
			Dog dog1=new Dog("Koa","white",323);
			Dog dog2=new Dog("Tommy","brown",344);
			objectOutputStream.writeObject(dog1);
			objectOutputStream.writeObject(dog2);
			System.out.println("Both dog is serialized!!!!");
		}
		
	}

}
