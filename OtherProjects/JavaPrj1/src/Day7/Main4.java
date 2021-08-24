package Day7;

import java.util.*;
public class Main4 {
	public static void main(String[] args) {
		System.out.println("The stream after applying the function is : ");
		List<String> list = Arrays.asList("java", "world", "j", "a", "v", "a");
		// Using Stream map(Function mapper) to convert the Strings in stream to
		// UpperCase form
//		list.stream().map(String::toUpperCase).forEach(System.out::println);		
		list.stream().map(String::toUpperCase).distinct().forEach(System.out::println);
	}
}
