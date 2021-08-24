package first;

interface Printabler1{  
void print();  
}  

interface Showabler extends Printabler1{  
void show();  
}  
class TestInterface2 implements Showabler{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
public static void main(String args[]){  
TestInterface2 obj = new TestInterface2();  
obj.print();  
obj.show();  
 }  
}
