package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.lang.Math;

public class SquareEx {

	public static void main(String args[])
	{
		
	List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,9);
	
	l.stream().filter(i -> ((i/(int)Math.sqrt(i)) * (i/(int)Math.sqrt(i))) == i).forEach(System.out::println);
	}
}
