package third;

interface AddOp1{
	int add(int a, int b);
}

interface SubOp1{
	int sub(int a, int b);
}

interface MultOp1{
	int mult(int a, int b);
}

interface DivOp1{
	float div(int a, int b);
}

public class LambdaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddOp1 a = (x,y) -> (x+y);
		System.out.println(a.add(1, 2));
		
		SubOp1 s = (x,y) -> (x-y);
		System.out.println(s.sub(1, 2));
		
		MultOp1 m = (x,y) -> (x*y);
		System.out.println(m.mult(1, 2));
		
		DivOp1 d = (x,y) -> {
			if (y==0) 
			{
				System.out.println("error");
				return 0;
			}
			else
				return x/y;
		};
		System.out.println(d.div(2,1));
		
//		DivOp1 d = (x,y) -> (y==0)?-1:x/y;
		
//		System.out.println(d.div(1, 0));
		
	}

}
