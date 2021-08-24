package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.*;
import java.lang.Math;

public class HighNoEx {

	public static void main(String args[])
	{
		
	List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,9);
	
	Integer maxValue = l.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
	
	System.out.println("max value = "+maxValue);
	
	Integer minValue = l.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
	
	System.out.println("min value = "+minValue);
	
	Integer sumValue = l.stream()
			  .mapToInt(Integer::intValue)
			  .sum();
	System.out.println("sum value = "+sumValue);
	
	
	System.out.println("average value = "+(int)sumValue/l.size());
	}
}
