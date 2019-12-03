package file.io;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		   File  file=new File("D:/jocker.txt");
		   System.out.println(file.exists());
		   System.out.println(file.isDirectory());
		   File  directory=new File("E:\\mongotemp");
		   for(File file2:directory.listFiles()) {
			   System.out.println(file2.getAbsolutePath());
		   }
	}
}
