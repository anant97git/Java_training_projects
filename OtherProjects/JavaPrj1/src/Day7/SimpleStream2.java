package Day7;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class SimpleStream2 {
   public static void main(String args[]) {
      List<String> list = Arrays.asList("Java", "is", "not", "great", "now");
list.stream()
    .filter(s -> !s.startsWith("n"))
    .map(String::toUpperCase)
    .forEach(s -> System.out.print(s + " "));
   }
}
