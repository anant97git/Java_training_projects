package Day9;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		if (args.length != 2)
			System.err.println("Usage: java FileCopy <source file> <destination>");
		else {
			try {
				copy(args[0], args[1]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
			System.out.println("file copied");
		}
	}
public static void copy(String from_name, String to_name) throws IOException {
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
