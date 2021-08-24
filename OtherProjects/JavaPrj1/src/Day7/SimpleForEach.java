package Day7;

import java.util.*;
import java.util.function.*;
 public class SimpleForEach {
     public static void main(String[] args) {
        Random random = new Random();
    random.ints().limit(20).forEach(e->System.out.println(e));
}
}