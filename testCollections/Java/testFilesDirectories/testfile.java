package testFilesDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class testfile {

	public static void main(String[] args) throws IOException {
		//1. list down files and dirs
		Path current_dir = Paths.get(".");
		
//		Files.list(current_dir).forEach(System.out::println);
//		
//		Files.walk(current_dir, 5).forEach(System.out::println);
//		
		//2. sfilter only java files
		
		Predicate<? super Path> predicate = path->String.valueOf(path).contains(".java");
		Files.walk(current_dir, 3).filter(predicate).forEach(System.out::println);
		
	}

}
