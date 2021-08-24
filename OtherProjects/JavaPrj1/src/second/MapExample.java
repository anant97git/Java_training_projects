package second;

//import java.util.*;
//
//public class MapExample {
//
//    public static void main(String[] args) {
//        Map<String, String> fruit = new HashMap<String, String>();
//        fruit.put("Apple", "red");
//        fruit.put("Pear", "yellow");
//        fruit.put("Pluma", "purple");
//        fruit.put("Cherry", "red");
//        for (String key : fruit.keySet()) {
//            System.out.println(key + ": " + fruit.get(key));
//        }
//    }
//}


import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> fruit = new HashMap<String, String>();
        fruit.put("Apple", "red");
        fruit.put("Pear", "yellow"); 
        fruit.put("Plum", "purple");
        fruit.put("Cherry", "red"); 
        Set set = fruit.entrySet(); // Get a set of the entries
	     Iterator i = set.iterator();
	     // Display elements
        while(i.hasNext()) {
		Map.Entry me = (Map.Entry)i.next();
		System.out.print(me.getKey() + ": ");
		System.out.println(me.getValue());
	    }
  }
}