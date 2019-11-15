package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFileExample {

    public static void main(String... args) throws IOException {
        Path path = Files.createTempFile("test-file", ".txt");
        System.out.println(path);
        Path otherPath = Paths.get(path.toString());
        boolean sameFile = Files.isSameFile(path, otherPath);
        System.out.println(sameFile);

        Path anotherPath = Paths.get("C:\\Users\\nagendra\\AppData\\Local\\Temp\\test-file4833787748587979272.txt");
        System.out.println(anotherPath);
        sameFile = Files.isSameFile(path, anotherPath);
        System.out.println(sameFile);
    }
}