package ocap1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Bird implements Serializable {

	private String name;
	private transient int age;
	private Tail tail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(InputStream is = new ObjectInputStream(
			 new BufferedInputStream(new FileInputStream("birds.dat")))) {
			//The method readObject() is undefined for the type InputStream 
			
			//Bird bird = is.readObject();
		}
	}	
}
