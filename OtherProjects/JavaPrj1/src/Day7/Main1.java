package Day7;

//interface A1
//{
//	void fn();
//}
//class B1{ //case 4: constructor reference
//	B1(){
//	 System.out.println("Inside the constructor");
// }
//}
//	
//public class Main1{
//	
//	public static void main(String[] ar) {
//		A1 a = B1 :: new;
//		a.fn();
//	}
//}

interface A1
{
	void fn(int x);
}
class B1{ //case 4: constructor reference
 B1(int x){
	 System.out.println("Inside the constructor " +  x);
 }
 

}
	
public class Main1{
	
	public static void main(String[] ar) {
		A1 a = B1 :: new;
		a.fn(10);
	}
}
