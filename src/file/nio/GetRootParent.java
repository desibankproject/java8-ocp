package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetRootParent {

	public static void main(String[] args) {
		Path path=Paths.get("/zoo/armadillo/shells.txt");
		Path root=path.getRoot();
		System.out.println(root);
		
		 Path currentParent = path;
		 System.out.println("Current Path = "+currentParent);
		 while((currentParent = currentParent.getParent()) != null) {
		 System.out.println(" Current parent is: "+currentParent);
		 }
	}
}
