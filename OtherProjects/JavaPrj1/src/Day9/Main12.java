package Day9;

// try with resources call close() fuction itself.

class MyAutoClosable1 implements AutoCloseable {
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }
    public void close() {
        System.out.println("MyAutoClosable closed!");
    }
}
public class Main12 {    
    public static void main(String args[]){      
       // Using try-with-resources  
         try(MyAutoClosable1 myAutoClosable = new MyAutoClosable1()){
               myAutoClosable.doIt();
          } 
      }      
}  