package Day7;

interface A3
{
	String fn(String s); //SAM
	default void print(String s) {
		show();
		System.out.println("The String: "+ s);
	}
	private void show() {
		System.out.println("This is private method");
	}
}
public class Main3{
	
	public static void main(String[] ar) {
		A3 a=String :: toUpperCase;
		a.print(a.fn("Java"));

	}
}
