package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShkruajFile {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("ProvaFilesh.txt");
        String content = "Po bejme prova";
        Files.writeString(fileName, content);
        String aktual = Files.readString(fileName);
        System.out.println(aktual);
        long fileSize = Files.size(fileName);
        System.out.println(fileSize);
    }
}
