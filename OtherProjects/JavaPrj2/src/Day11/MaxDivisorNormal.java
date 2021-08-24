package Day11;

public class MaxDivisorNormal {

	public static int getDivisor(int n) {
		int count = 0;
		
		for (int i=1;i<=n;i++) {
			if (n%i == 0)
				count++;
		}
		return count;
	}
	public static void main(String args[]) {
		
		int maxVal = 1;
		
		int maxcount = 0;
		
		for (int i=2;i<=10000;i++) {
			int count = MaxDivisorNormal.getDivisor(i);
			
			if (count > maxcount)
				maxVal = i;
			
			if (count == maxcount && i>maxVal)
				maxVal = i;
		}
		
		System.out.println("max value with max. no. of divisor :- "+maxVal);
	}
}
