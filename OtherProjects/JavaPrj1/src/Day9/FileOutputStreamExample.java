package Day9;

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("C:\\AJ\\test.txt");    
             String s="Hello Java!";    
             byte b[]=s.getBytes();//converting string into byte array
             fout.write(b);    
             fout.close();    
             System.out.println("File OverWritten");    
            }catch(Exception e){System.out.println(e);}    
      }    
} 
