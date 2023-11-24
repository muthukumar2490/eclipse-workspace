package testFilesDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class testfiles1 {

	public static void main(String[] args) throws IOException {
		//1.read files
		Path current_dir = Paths.get("./Java/testFilesDirectories/testfile.txt");
//		List<String> lines = Files.readAllLines(current_dir);// this would load whole file and what if that 
//		// file contains millions lines, then leads to memory error
//		System.out.println(lines);
		
		//2. another way through stream
//		Files.lines(current_dir).forEach(System.out::println);
	
//		//3. to lowercase
//		Files.lines(current_dir)
//		.map(String::toLowerCase)
//		.forEach(System.out::println);
		
		//4. string contains  "ub"
		Files.lines(current_dir)
		.map(String::toLowerCase)
		.filter(str->str.contains("ub")).forEach(System.out::println);
		
		
	}

}
