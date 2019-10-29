package q155;

import java.io.File;
import java.io.IOException;

public class Q41 {
	public void recDelete(String dirName) throws IOException {
		File[] listOfFiles = new File(dirName).listFiles();
		if (listOfFiles != null && listOfFiles.length > 0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory()) {
					recDelete(aFile.getAbsolutePath());
				} else {
					if (aFile.getName().endsWith(".class"))
						aFile.delete();

				}
			}}}
	}
