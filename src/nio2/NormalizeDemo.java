package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeDemo {
	public static void main(String[] args) {
		Path path1=Paths.get("root/tomcat/bin/startupsh");
		Path path2=Paths.get("boot/bansh");//../../root/tomcat/bin/startup.sh
		Path path3=path1.relativize(path2);
		System.out.println(path3);
		System.out.println(path3.normalize());
		
		Path path4=path2.relativize(path1);
		System.out.println(path4);
	}
}
