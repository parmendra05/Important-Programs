package top20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReading {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\parme\\Desktop\\fruitsList.txt");

        String input = "Hello Java From JVM";

        Files.writeString(path , input);

        String print = Files.readString(path);

        System.out.println(print);

    }
}
