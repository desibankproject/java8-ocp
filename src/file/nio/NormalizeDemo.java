package file.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NormalizeDemo {
	
	public static void main(String[] args) throws IOException {
		
		final Path path=Paths.get(".");
		Files.readAttributes(path, type, options)
		int count=0;
		System.out.println(path.toString());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.toRealPath());
		for(int i=0;i<path.getNameCount();++i) {
			count++;
		}
		System.out.println(count);
	}

}
