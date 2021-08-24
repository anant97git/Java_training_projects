package Day9;

import java.io.File;
public class FileDemo {
   public static void main(String[] args) {
      File f = null;
      String s = "C:\\AJ\\test.txt";
      try {
             // create new file
            f = new File(s);
            // true if the file is executable
            boolean bool = f.canExecute();
            System.out.println(f.canExecute());
            System.out.println(f.getCanonicalPath());
            System.out.println(f.getTotalSpace());
            System.out.println(f.createNewFile());
            System.out.println(f.getParent());
            System.out.println(f.exists());
            System.out.println(f.getPath());
            System.out.println(f.getUsableSpace());
            System.out.println(f.hashCode());
// find the absolute path
            String a = f.getAbsolutePath(); 
            // prints absolute path
            System.out.print(a);
            System.out.println(" is executable: "+ bool);
      } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}