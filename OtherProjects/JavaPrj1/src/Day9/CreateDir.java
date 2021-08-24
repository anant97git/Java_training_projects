package Day9;

// making directories

import java.io.File;
public class CreateDir {

   public static void main(String args[]) {
      String dirname = "/AJ/tmp/mydirs";
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdirs();
      System.out.println("Dirs Created ..");
   }
}
