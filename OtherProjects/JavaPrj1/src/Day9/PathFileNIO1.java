package Day9;

import java.io.IOException;
import java.nio.file.*;
public class PathFileNIO1 {
	 public static void main(String[] args) {
		 Path sourcePath = Paths.get("/AJ/test.txt");
		 Path destinationPath = Paths.get("/AJ/test-copy.txt");
		 try {
		     Files.copy(sourcePath, destinationPath);
		     System.out.println("Done");
		 } catch(Exception e) { System.out.println("exception :- "+e); }
    }	}
