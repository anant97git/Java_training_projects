package Day7;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
public class SimpleStat {
	public static void main(String[] args) {
		System.out.println("---DoubleSummaryStatistics---");		
		DoubleSummaryStatistics dstats = DoubleStream.of(5.33d,2.34d,5.32d,2.31d,3.51d).
				collect(DoubleSummaryStatistics::new, DoubleSummaryStatistics::accept, DoubleSummaryStatistics::combine);
System.out.println("Max:"+dstats.getMax()+", Min:"+dstats.getMin());
		System.out.println("Count:"+dstats.getCount()+", Sum:"+dstats.getSum());
		System.out.println("Average:"+dstats.getAverage());	
}
}