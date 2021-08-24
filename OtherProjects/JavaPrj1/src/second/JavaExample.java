package second;
//
//import java.util.*;  
//class JavaExample{  
//   public static void main(String args[]){  
//      ArrayList<String> alist=new ArrayList<String>();  
//      alist.add("Steve");
//      alist.add("Tim");
//      alist.add("Lucy");
//      alist.add("Pat");
//      alist.add("Tom");
//       //displaying elements
//      System.out.println(alist);
//      //Adding "Steve" at the fourth position
//      alist.add(3, "Steve");
//      //displaying elements
//      System.out.println(alist);
//      
//      alist.remove("Steve");
//      alist.remove("Angela");
//      System.out.println(alist);
//      //Removing 3rd element
//      alist.remove(2);
//      System.out.println(alist);
//      
//   }  
//}


//import java.util.ArrayList;
//public class JavaExample {
//    public static void main(String[] a){
//       ArrayList<String> al = new ArrayList<String>();
//       //add elements to the ArrayList
//       al.add("JAVA");
//       al.add("C++");
//       al.add("PERL");
//       al.add("PHP");
//       System.out.println(al);
//       System.out.println("Element at index 1: "+al.get(1));
//       System.out.println("Does list contains JAVA? "+al.contains("JAVA"));
// 
//al.add(2,"PLAY"); //add elements at a specific index
//       System.out.println(al);
//       System.out.println("Is arraylist empty? "+al.isEmpty());
//       System.out.println("Index of PERL is "+al.indexOf("PERL"));
//       System.out.println("Size of the arraylist is: "+al.size());
//   }
//}


import java.util.*;  
class JavaExample{  
  public static void main(String args[]){  
     ArrayList<String> alist=new ArrayList<String>();  
     alist.add("Gregor Clegane");  
     alist.add("Khal Drogo");  
     alist.add("Cersei Lannister");  
     alist.add("Sandor Clegane"); 
     alist.add("Tyrion Lannister");
  
     //iterating ArrayList
     for(String str:alist)  
        System.out.println(str);  
     }  
}