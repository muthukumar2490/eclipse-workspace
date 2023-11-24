package testFilesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class testFileWrite3 {

	public static void main(String[] args) throws IOException {

		Path fileToWrite = Paths.get("./Java/testFilesDirectories/testfilewrite.txt");
		List<String> list = List.of("Apple","Orange","banana");
		Files.write(fileToWrite, list);
		
	}

}
