package Day7;

import java.util.stream.*;
class A9 {
	public static void fn(String s) {
		s = "Hello " + s;
		System.out.println(s);
	}
}

public class Main9 {
	public static void main(String args[]) {
		Stream<String> words = Stream.of("lower", "case", "text", "Java", "Prg");
		long c = words.peek(A9::fn).map(String::toUpperCase).peek(System.out::println).count();
		System.out.println("The number of Elements : " + c);
	}
}
