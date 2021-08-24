package Day8;

import java.io.*;  
class Parent5{  
void msg()throws Exception{System.out.println("parent");}  
}  

class TestExceptionChild5 extends Parent5{  
void msg(){System.out.println("child");}  

public static void main(String args[]){  
 Parent5 p=new TestExceptionChild5();  
 try{  
 p.msg();  
 }catch(Exception e){}  
}  
}  
//If the superclass method declares an exception
//* Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.