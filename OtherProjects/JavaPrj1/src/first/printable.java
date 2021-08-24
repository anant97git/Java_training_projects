package first;

interface printable1{  
void print();  
}  
class printable implements printable1{  
public void print(){
System.out.println("Hello");
}  
public static void main(String args[]){  
printable obj = new printable();  
obj.print();  	 
}  
}  

