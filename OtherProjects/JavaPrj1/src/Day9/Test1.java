package Day9;

// try with resources

import java.io.*;
class Test1 {
  public static void main(String[] args) {
     try(BufferedReader br=new BufferedReader(new FileReader("C:\\AJ\\myFile.txt")))         {
            String str;
            while((str=br.readLine())!=null)   {
                   System.out.println(str);
             }
      }
     catch(IOException ie)
     {  System.out.println("exception");  }
  }
}
