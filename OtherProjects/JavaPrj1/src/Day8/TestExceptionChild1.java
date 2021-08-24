package Day8;

import java.io.*;  
class Parent1{  
  void msg(){System.out.println("parent");}  
}  
  
class TestExceptionChild1 extends Parent1{  
  void msg()throws ArithmeticException{  
    System.out.println("child");  
  }  
  public static void main(String args[]){  
   Parent1 p=new TestExceptionChild1();  
   p.msg();  
  }  
} 
//If the superclass method does not declare an exception

//* Rule: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception
//but can declare unchecked exception.