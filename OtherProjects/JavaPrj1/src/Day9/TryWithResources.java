package Day9;


import java.io.DataInputStream;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;    
public class TryWithResources {    
public static void main(String args[]){      
try(    // Using multiple resources  
        FileOutputStream fileOutputStream =new FileOutputStream("abc.txt");  
        InputStream input = new FileInputStream("abc.txt")){ 
// ----------------------Code to write data into file----------------------------//  
        String msg = "Welcome to java!";      
        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
        fileOutputStream.write(byteArray);  // Writing  data into file  
        System.out.println("------------Data written into file--------------");  
        System.out.println(msg);  
        // ------------------------Code to read data from file--------------------------//
DataInputStream inst = new DataInputStream(input);    
        int data = input.available();    
        // Returns an estimate of the no of bytes read from this input stream.   
        byte[] byteArray2 = new byte[data]; //    
        inst.read(byteArray2);    
        String str = new String(byteArray2); // passing byte array into String constructor  
        System.out.println("------------Data read from file--------------");
        
        
        throw new IOException("Sorry data could not be read"); // important part of the code
//        System.out.println(str); // display file data  
}
catch(Exception exception){  
       System.out.println(exception);  
}  	}      } 

