package first;

class Animal{}  
class Dog extends Animal{//Dog inherits Animal  
   public static void main(String args[]){  
 		Dog d=new Dog();  
  	System.out.println(d instanceof Animal);//true  
  }  
}