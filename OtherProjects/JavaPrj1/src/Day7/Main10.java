package Day7;

import java.util.*; 
public class Main10 { 
	public static void main(String args[]) { 
		List<String> gadgets = new ArrayList<>(); 
		gadgets.add("SmartPh"); 
		gadgets.add("SmartWatch"); 
		gadgets.add("SmartTV"); 
		gadgets.add("iPhone"); 
		// using lambda expression and stream methods 
//		String item = gadgets.stream() 
//				.peek(s -> System.out.println("processing: " + s)) 
//				.filter(s -> s.length() > 8) .findFirst().orElse(""); 
		String item = gadgets.stream() 
				.peek(s -> System.out.println("processing: " + s)) 
				.filter(s -> s.length() > 8) .findAny().orElse("");
		System.out.println("In Java 8, first item: " + item); 
		}	}

