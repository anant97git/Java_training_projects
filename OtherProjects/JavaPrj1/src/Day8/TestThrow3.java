package Day8;
// throws keyword
import java.io.IOException;  
class TestThrow3{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled "+e);}  
  }  
public static void main(String args[]){  
   TestThrow3 obj=new TestThrow3();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
} 


//import java.io.*;  
//class M{  
// void method()throws IOException{  
//  throw new IOException("device error");  
// }  
//}  
//public class Testthrows2{  
//   public static void main(String args[]){  
//    try{  
//     M m=new M();  
//     m.method();  
//    }catch(Exception e){System.out.println("exception handled");}     
//     System.out.println("normal flow...");  
//  }   
//}
//import java.io.*;  
//class M{  
// void method()throws IOException{  
//  System.out.println("device operation performed");  
// }  
//}  
//class Testthrows3{  
//   public static void main(String args[]) throws IOException{//declare exception  
//     M m=new M();  
//     m.method();  
//  
//    System.out.println("normal flow...");  
//  }  
//} 
//import java.io.*;  
//class M{  
// void method()throws IOException{  
//  throw new IOException("device error");  
// }  
//}  
//class Testthrows4{  
//   public static void main(String args[])throws IOException{//declare exception  
//     M m=new M();  
//     m.method();  
//  
//    System.out.println("normal flow...");  
//  }  
//} 
