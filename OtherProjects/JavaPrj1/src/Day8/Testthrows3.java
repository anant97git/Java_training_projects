package Day8;

import java.io.*;  
class M1{  
void method()throws IOException{  
System.out.println("device operation performed");

}  
}  
class Testthrows3{  
 public static void main(String args[]) throws IOException{//declare exception  
   M1 m=new M1();  
   m.method();  

  System.out.println("normal flow...");  
}  
} 