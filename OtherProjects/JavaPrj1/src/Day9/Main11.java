package Day9;



 class MyAutoClosable implements AutoCloseable {
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyAutoClosable closed!");
    }
}

//public class Main11 {    
//    public static void main(String args[]){      
//       // Using try-without-resources  
//         try{
//        	 MyAutoClosable myAutoClosable = new MyAutoClosable();
//               myAutoClosable.doIt();
//               if(3>2)
//                 throw new Exception("OH no!");
//        	 myAutoClosable.close(); // here, this is an unreachable code
//          }
//         catch(Exception exception){  
//              System.out.println(exception);  
//          }     
//      }      
//}  


public class Main11 {    
   public static void main(String args[]){      
       // Using try-with-resources  
         try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
               myAutoClosable.doIt();
               if(3>2)
                 throw new Exception("OH no!");
          }
         catch(Exception exception){  
              System.out.println(exception);  
          }     
      }      
}  