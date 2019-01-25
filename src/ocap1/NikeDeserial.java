package ocap1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NikeDeserial {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File file=new File("nky.txt");
		FileInputStream fileOutputStream=new FileInputStream(file);
		ObjectInputStream objectOutputStream=new ObjectInputStream(fileOutputStream);
		Nike nike=(Nike) objectOutputStream.readObject();
		System.out.println(nike.color);
	}
}
