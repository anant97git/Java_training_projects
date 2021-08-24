package Day7;

import java.util.ArrayList;
import java.util.List;

public class FilterExer {
  public static void main(String args[]) {
	  List<String> items = new ArrayList<>();

      items.add("coins");
      items.add("pens");
      items.add("keys");
      items.add("sheet");
      items.add("");
      
      long c = items.stream().filter(item -> item.length()==0).count();
      System.out.println("count of empty strings :- "+c);
  }
}
