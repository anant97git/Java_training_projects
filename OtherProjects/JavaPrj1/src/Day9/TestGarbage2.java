package Day9;

import java.awt.Window;  

public class TestGarbage2 {  
 
    public static void main(String[] args) {  
           
        for (int i = 0; i< 100; i++) {  
        new Window(null);  
             }  
        System.out.println("before garbage collection = "+Window.getWindows().length);  
        System.gc();  
        System.out.println("after garbage collection = "+Window.getWindows().length);  
          }  
}