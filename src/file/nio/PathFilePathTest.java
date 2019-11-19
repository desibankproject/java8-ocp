package file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {
	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) {
		Path p=Paths.get("/zoo/armadillo/shells.txt");
		Path p1=p.getParent();
		Path p2=p1.getParent();
		Path p3=p2.getParent();
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));
	}
}