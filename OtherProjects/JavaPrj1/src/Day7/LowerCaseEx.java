package Day7;

import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class LowerCaseEx {
  public static void main(String args[]) {
	  List<String> list = new ArrayList<String>();
	  list.add("First");
	  list.add("second");
	  
	  list.stream().map(String :: toLowerCase).forEach(System.out::println);
  }
}
