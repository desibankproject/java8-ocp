package file.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistCarObjectIntoFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file=new File("D:/harini.txt");
		try(FileOutputStream fileOutputStream=new FileOutputStream(file);
				BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(bufferedOutputStream)){
			Car car1=new Car("Audi","white", 19292);
			Car car2=new Car("BMW","black", 2343432);
			Car car3=new Car("Maruti","silver", 342);
			objectOutputStream.writeObject(car1);
			objectOutputStream.writeObject(car2);
			objectOutputStream.writeObject(car3);
			System.out.println("Thanks following objects are saved into the files");
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
		}
	}
}
