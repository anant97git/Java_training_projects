package Day8;

import java.io.*;  
class M2{  
void method()throws IOException{  
throw new IOException("device error");  
}  
}  
class Testthrows4{  
 public static void main(String args[])throws IOException{//declare exception  
//    try {
	M2 m=new M2();  
   m.method();  
//    }
//    catch(Exception e) {
//    	System.out.println("exception :- "+e);
//    }
  System.out.println("normal flow...");  
}  
} 
