package Day8;

import java.io.*;  
class Parent2{  
  void msg()throws ArithmeticException{ System.out.println("parent");}  
}  
  
class TestExceptionChild2 extends Parent2{  
  void msg()throws Exception{System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent2 p=new TestExceptionChild2();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
} 
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.


//import java.io.*;  
//class Parent{  
//  void msg()throws Exception{System.out.println("parent");}  
//}  
//  
//class TestExceptionChild3 extends Parent{  
//  void msg()throws Exception{System.out.println("child");}  
//  
//  public static void main(String args[]){  
//   Parent p=new TestExceptionChild3();  
//   try{  
//   p.msg();  
//   }catch(Exception e){}  
//  }  
//}  
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.




//import java.io.*;  
//class Parent{  
//  void msg()throws Exception{System.out.println("parent");}  
//}  
//  
//class TestExceptionChild4 extends Parent{  
//  void msg()throws ArithmeticException{System.out.println("child");}  
//  
//  public static void main(String args[]){  
//   Parent p=new TestExceptionChild4();  
//   try{  
//   p.msg();  
//   }catch(Exception e){}  
//  }  
//}  
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.


//import java.io.*;  
//class Parent{  
//  void msg()throws Exception{System.out.println("parent");}  
//}  
//  
//class TestExceptionChild5 extends Parent{  
//  void msg(){System.out.println("child");}  
//  
//  public static void main(String args[]){  
//   Parent p=new TestExceptionChild5();  
//   try{  
//   p.msg();  
//   }catch(Exception e){}  
//  }  
//}  
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
