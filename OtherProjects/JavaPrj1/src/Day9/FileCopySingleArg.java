package Day9;
import java.io.*;
public class FileCopySingleArg {
	public static void main(String[] args) {
		if (args.length != 1)
			System.err.println("Usage: java FileCopy <source file>");
		else {
			try {
				copy(args[0]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			System.out.println("file copied");
		}
	}
public static void copy(String from_name) throws IOException {
	    int c = 0;
	    
	    if (!from_name.contains(".java"))
	    	throw new IOException("not right type of file");
	
	    String to_name = from_name.substring(0,from_name.length()-4) + "clas";
		File from_file = new File(from_name);
		
		File to_file = new File(to_name);
		FileInputStream from = null;
		FileOutputStream to = null;
		try {
			from = new FileInputStream(from_file);
			to = new FileOutputStream(to_file);
			byte[] buffer = new byte[4096];
			int bytes_read;
while ((bytes_read = from.read(buffer)) != -1)
				to.write(buffer, 0, bytes_read);
		} finally {
			if (from != null || to != null)
				try {
					from.close();
					to.close();
				} catch (IOException e) {
					;
				}
		}
	}
}
