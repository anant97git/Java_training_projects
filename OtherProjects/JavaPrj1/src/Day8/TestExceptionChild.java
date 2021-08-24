package Day8;

import java.io.*;  
class Parent{  
  void msg(){System.out.println("parent");}  
}  
  
class TestExceptionChild extends Parent{  
  void msg() throws IOException{  
    System.out.println("TestExceptionChild");  
  }  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild();  
   p.msg();  
  }  
} 
//If the superclass method does not declare an exception
//* Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.

// commpile time exception