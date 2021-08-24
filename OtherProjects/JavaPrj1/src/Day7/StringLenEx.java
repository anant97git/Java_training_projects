package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StringLenEx {

	// TODO Auto-generated method stub
   public static void main(String[] args) {
		Stream<String> w = Stream.of("lower", "case", "text");
		List<Integer> l= w.map(s -> s.length()).collect(Collectors.toList());
		System.out.println(l);
	}
}
