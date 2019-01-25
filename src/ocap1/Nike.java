package ocap1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Nike extends Shoes implements Serializable {
	int color=1;
	public Nike(){
		System.out.println("Nike cons!!!!!!");
	}
	
	public static void main(String[] args) throws IOException {
		File file=new File("nky.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Nike());
		objectOutputStream.close();
	}
	
}
