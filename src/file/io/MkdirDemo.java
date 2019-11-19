package file.io;

import java.io.File;

public class MkdirDemo {

	public static void main(String[] args) {
		File file=new File("D:/opo/temp/desktop/jack");
		System.out.println(file.mkdirs());
	}
}
