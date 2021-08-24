package second;

//import java.util.*;
//public class MainPrg {
//public static void main(String[] args) {
//	LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
//	  hm.put(100,"A");  
//	  hm.put(101,"B");  
//	  hm.put(102,"C");  
//    //Fetching key  
//    System.out.println("Keys: "+hm.keySet());  
//   //Fetching value  
//
//System.out.println("Values: "+hm.values());  
//   //Fetching key-value pair  
//    System.out.println("Key-Value pairs: "+hm.entrySet()); 
//	  for(Map.Entry m:hm.entrySet()){  
//	        System.out.println(m.getKey()+" "+m.getValue());  		  }  
//    System.out.println("Before invoking remove() method: "+hm);     
//    hm.remove(102);  
//    System.out.println("After invoking remove() method: "+hm);
// }
//}


import java.util.*;

public class MainPrg {
	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "A");
		map.put(102, "B");
		map.put(101, "C");
		map.put(103, "C");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Before remove: " + map);
		map.remove(102); // Remove value for key 102
		System.out.println("After remove: " + map);
// Here, we specify the if and else statement as arguments of the method
		System.out.println(map.getOrDefault(101, "Not Found"));
		System.out.println(map.getOrDefault(105, "Not Found"));
		System.out.println("Initial Map: " + map);
		// Inserts, as the specified pair is unique
		map.putIfAbsent(104, "D");
		System.out.println("Updated Map: " + map);
		// Returns the current value, as the specified pair already exist
		map.putIfAbsent(101, "E");
		System.out.println("Updated Map: " + map);
	}
}



//import java.util.*;
//public class MainPrg {
//public static void main(String[] args) {
//	TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
//	   map.put(100,"A");  
//	  map.put(102,"B");  
//	  map.put(101,"C");  
//	  map.put(103,"C");  
//for(Map.Entry m:map.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  	  }  
//	  //Maintains descending order  
//      System.out.println("descendingMap: "+map.descendingMap());  
//      //Returns key-value pairs whose keys are less than or equal to the specified key.  
//      System.out.println("headMap: "+map.headMap(102,true));  
////Returns key-value pairs whose keys are greater than or equal to the specified key.  
//      System.out.println("tailMap: "+map.tailMap(102,true));  
//      //Returns key-value pairs exists in between the specified key.  
//      System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
//     }
//}
