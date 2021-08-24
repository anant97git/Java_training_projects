package first;

//public class PalinDemo {
//  
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String st = "nitin";
//		
//		int len = st.length();
//		System.out.println(len);
//		
//		if (len == 0 || len == 1)
//			System.out.println("It is pallindrome");
//		
//		int i = 0;
//		int j = len - 1;
//		int cond = 0;
//		
//		while (i<j)
//		{
//			if (st.charAt(i) != st.charAt(j))
//			{
//				System.out.println("Not pallindrome");
//				cond = 1;
//				break;
//			}
//			
//			i++;
//			j--;
//		}
//		
//		if (cond == 0)
//			System.out.println("Pallindrome");
//	}
//
//}

//public class PalinDemo{
//	public static void main(String[] args) {
//		String str = "nitin";
//		
//		StringBuffer s1 = new StringBuffer(str);
//		s1.reverse();
//		
//		String rev = s1.toString();
//		
//		if (str.equals(rev)) {
//			System.out.println("Pallindrome");
//		}
//		else
//		{
//			System.out.println("not pallindrome");
//		}
//			
//	}
//}

public class PalinDemo{
	public static void main(String[] args) {
		String str = "jitin";
		
		StringBuilder s1 = new StringBuilder(str);
		s1.reverse();
		
		String rev = s1.toString();
		
		if (str.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
			
	}
}
