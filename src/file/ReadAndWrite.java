package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {

		Path path = Path.of("C:\\Users\\Me\\Desktop\\code.txt");

		String data = "Hello on behalf of Java";

		// Writing on file
		Files.writeString(path, data);

		System.out.println("written on the file");

		// Reading from file
		String content = Files.readString(path);
		System.out.println(content);

	}

}
