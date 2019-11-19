package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NameCountDemos {
	
	public static void main(String[] args) {
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: "+path);
		for(int i=0; i<path.getNameCount(); i++) {
		 System.out.println(" Element "+i+" is: "+path.getName(i));
		}
	}

}
