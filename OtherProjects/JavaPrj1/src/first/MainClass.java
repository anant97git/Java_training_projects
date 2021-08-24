package first;

//public class MainClass {   
//	   public static void main(String args[]) {
//	       Dog1 dog = new Dog1();
//	       Mammal anim1 = (Mammal) dog;
//	       anim1.eat(); //Dog is eating…
//	      
//	       Mammal anim2 = new Cat();
//	      Cat cat = (Cat) anim2;
//	      anim2.eat(); //Eating…
//	      cat.meow(); //Meow Meow!
//	   }
//	}

public class MainClass {   
public static void main(String args[]) {
    Dog1 dog = new Dog1();
    Mammal anim1 = (Mammal) dog;
    anim1.eat(); //Dog is eating…
//    anim1.bark();
   
    Mammal anim2 = new Dog1();
    anim2.eat();
    anim2.sleep();
    System.out.println(anim2 instanceof Dog1);
    
//   Cat cat = (Cat) anim2;
//   anim2.eat(); //Eating…
//   cat.meow(); //Meow Meow!
}
}

//public class MainClass {   
//	   public static void main(String args[]) {
//	       Dog1 dog = new Dog1();
//	       Mammal anim1 = (Mammal) dog;
//	       anim1.eat(); //Dog is eating…
//	      
//	       Mammal anim3 = new Dog1();
//	 anim3.eat(); //Dog is eating…
//	//anim3.bark();
//	Mammal anim2 = new Cat();
//	      Cat cat = (Cat) anim2;
//	      anim2.eat(); //Eating…
//	      cat.meow(); //Meow Meow!
//	   }
//	}


//public class MainClass {   
//	   public static void main(String args[]) {
//	       Dog1 dog = new Dog1();
//	       Cat cat = new Cat();
//	 
//	       AnimalTrainer trainer = new AnimalTrainer();
//	       trainer.teach(dog);
//	       trainer.teach(cat);
//	   }
//	}