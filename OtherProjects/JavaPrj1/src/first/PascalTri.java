package first;

public class PascalTri {

	public static void main(String args[])
	{
		int[] arr = {1};
		int len = 6;
		
		for (int i=0;i<len;i++)
		{
            for (int j=0;j<len-i;j++)
            	System.out.print("\t");
            
            for (int j=0;j<=i;j++)
            	System.out.print(arr[j]+"\t\t");
            
			System.out.println("\n");
			
			int templen = arr.length;
			
			int[] b = new int[templen+1];
			
			if (templen == 1)
			{
				b[0]=1;
				b[1]=1;
			}
			else
			{
				for (int j=0;j<=templen;j++)
				{
					if (j==0 || j==templen)
						b[j]=1;
					else
					{
						b[j] = arr[j-1] + arr[j];
					}
				}
			}
			
			arr = new int[templen+1];
			
			arr = b;
		}
	}
}
