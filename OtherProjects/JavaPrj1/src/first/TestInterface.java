package first;

interface Printabler{  
void print();  
}  
interface Showable{  
void print();  
}  
class TestTnterface implements Printabler, Showable{  
public void print(){
System.out.println("Hello");
}  
public static void main(String args[]){  
TestTnterface obj = new TestTnterface();  
obj.print();  
 }  
}