package Day9;

import java.nio.file.*;
public class FileAttirbute {
	public static void main(String args[]) {
		 Path sourcePath = Paths.get("/AJ/test.txt");
		 try {
			 System.out.println("whetherr file is readable : "+Files.isReadable(sourcePath));
			 System.out.println("file content type : "+Files.probeContentType(sourcePath));
			 System.out.println("size : - "+Files.size(sourcePath));
			 System.out.println("content of file : "+Files.readString(sourcePath));
			 System.out.println("file store : "+Files.getFileStore(sourcePath));
			 System.out.println(Files.lines(sourcePath));
		 }
		 catch(Exception e) {
			 System.out.println("exception : "+e);
		 }
	}
}
