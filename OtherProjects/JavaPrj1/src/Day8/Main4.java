package Day8;

import java.util.*;
import java.util.function.Consumer;
public class Main4{
  public static void main(String args[]){
  Consumer<Integer> c1= i-> System.out.print(" "+i);
  Consumer<Integer> c2= i-> System.out.print("(printed "+i+")");
  Consumer<Integer> CAThen = c1.andThen(c2);
  List<Integer> integerList=Arrays.asList(1, 10, 200, 101, -10, 0);
  printList(integerList,CAThen);
 }
 public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer){
  for(Integer integer:listOfIntegers){
   consumer.accept(integer);
  }
 }
}
