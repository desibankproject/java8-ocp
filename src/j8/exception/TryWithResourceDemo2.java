package j8.exception;

import java.io.Closeable;

class Dog implements AutoCloseable {
	@Override
	public void close()  {
		   System.out.println("Hey! Dog is closed!!!");
	}
}


class Tiger implements AutoCloseable {
	@Override
	public void close()  {
		   System.out.println("Hey! Tiger is closed!!!");
	}
}

public class TryWithResourceDemo2 {
	public static void main(String[] args)    {
		try (Dog d=new Dog();Tiger tiger=new Tiger();) {
			   System.out.println("Heheye8282828");
			   System.out.println("Heheye8282828");
		}
	}
}
