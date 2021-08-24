package Day8;

import java.io.*;  
class Parent3{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild3 extends Parent3{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent3 p=new TestExceptionChild3();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.