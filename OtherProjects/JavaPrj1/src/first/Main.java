package first;
//
//class Test1<T> {
//    // An object of type T is declared
//    T obj;
//    Test1(T obj) {  this.obj = obj;  }  // constructor
//    public T getObject()  { return this.obj; }
//}
//  // Driver class to test above
//class Main {
//    public static void main (String[] args)     {
//        // instance of Integer type
//        Test1 <Integer> iObj = new Test1<Integer>(15);
//        System.out.println(iObj.getObject());
//          // instance of String type
//        Test1 <String> sObj =  new Test1<String>("HelloJava");
//   
//        System.out.println(sObj.getObject());
//    }
//}

//class Test1<T, U> {
//    T obj1;  // An object of type T
//    U obj2;  // An object of type U
//     // constructor
//    Test1(T obj1, U obj2)     {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//public void print()     {
//        System.out.println(obj1);
//        System.out.println(obj2);
//    }
//}
//
//public class Main {
//    public static void main (String[] args) 
//    {
//        Test1 <String, Integer> obj = new Test1<String, Integer>("Java", 15);
//         obj.print();
//    }
//}

import java.util.*;
//class Main {
//   public static void main(String[] args)    {
//       // Creatinga an ArrayList without any type specified
//       ArrayList al = new ArrayList();
//        al.add("Sachin");
//       al.add("Rahul");
//       al.add(10); // Compiler allows this
//        String s1 = (String)al.get(0);
//       String s2 = (String)al.get(1);
//
//       // Causes Runtime Exception
//       String s3 = (String)al.get(2);
//   }
//}


//import java.util.*;
//class Main {
//   public static void main(String[] args)     {
//       // Creating a an ArrayList with String specified
//       ArrayList <String> al = new ArrayList<String> ();
//        al.add("Sachin");
//       al.add("Rahul");
//        // Typecasting is not needed 
//       String s1 = al.get(0);
//       String s2 = al.get(1);
//   }
//}

//import java.util.*;
//class Main {
//    public static void main(String[] args)     {
//        // Creating a an ArrayList with String specified
//        ArrayList <String> al = new ArrayList<String> ();
//        al.add("Sachin");
//        al.add("Rahul");
//         // Now Compiler doesn't allow this
//        al.add(10); 
//         String s1 = (String)al.get(0);
//        String s2 = (String)al.get(1);
//        String s3 = (String)al.get(2);
//    }
//}


//import java.util.*;
//class Main {
//   public static void main(String[] args)     {
//       // Creating a an ArrayList with String specified
//       ArrayList <String> al = new ArrayList<String> ();
//        al.add("Sachin");
//       al.add("Rahul");
//        // Typecasting is not needed 
//       String s1 = al.get(0);
//       String s2 = al.get(1);
//   }
//}
