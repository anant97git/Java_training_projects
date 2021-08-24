package Day9;

// try without resources

import java.io.*;
class Test  {
  public static void main(String[] args) {
    try {
        String str;
       //opening file in read mode using BufferedReader stream
        BufferedReader br=new BufferedReader(new FileReader("C:\\AJ\\myFile.txt"));
        while((str=br.readLine())!=null) {
                 System.out.println(str);
//                 throw new IOException();
         }
         br.close();	//closing BufferedReader stream
     }catch(IOException ie)
     {  System.out.println("exception");  }
   }
}