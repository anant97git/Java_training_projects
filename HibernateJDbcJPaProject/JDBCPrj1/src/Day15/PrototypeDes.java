package Day15;

class A1{
	int x;
	A1(int x){this.x=x;}
	A1(){}
	int get() {
		return x;
	}
	void set(int x) {
		this.x=x;
	}
	
}
class prototypeA{
	A1 a;
	prototypeA(){}
	prototypeA(int x){if(x==10) {a=new A1();}else {a = new A1(x);}}
	int get() {
		System.out.println("This is the prototype, not the original A class object");
		return a.get();
	}
	void set(int x) {
		a.set(x);
	}
	
}
public class PrototypeDes {
	public static void main(String args[]) {
		prototypeA a=new prototypeA(80);
		//a.set(10);
		System.out.println(a.get());
	}
}