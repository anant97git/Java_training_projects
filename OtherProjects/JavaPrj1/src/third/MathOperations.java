package third;

interface AddOp{
	int add(int a, int b);
}

interface SubOp{
	int sub(int a, int b);
}

interface MultOp{
	int mult(int a, int b);
}

interface DivOp{
	float div(int a, int b);
}

public class MathOperations {
   public static void main(String args[]) {
	   
	   AddOp a = new AddOp() {
		   public int add(int x, int y) {
		   return x+y;
		   }
	   };
	   
	   System.out.println(a.add(1, 2));
	   
	   SubOp s = new SubOp() {
		   public int sub(int x, int y) {
		   return x-y;
		   }
	   };
	   
	   System.out.println(s.sub(1, 2));
	   
	   MultOp m = new MultOp() {
		   public int mult(int x, int y) {
		   return x*y;
		   }
	   };
	   
	   System.out.println(m.mult(2,1));
	   
	   DivOp d = new DivOp() {
		   public float div(int x, int y) {
		   if (y==0)
			   return 1;
		   else 
			   return (x/y);
		   }
	   };
	   
	   System.out.println(d.div(2,1));
	   
	   
	   
   }
}
