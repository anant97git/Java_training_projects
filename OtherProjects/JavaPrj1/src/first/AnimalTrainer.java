package first;

class AnimalTrainer {
    public void teach(Mammal anim) { //upcasting
        // do animal-things
        anim.move();
        anim.eat();
 
        // if there's a dog, tell it barks
        if (anim instanceof Dog1) {
            Dog1 dog = (Dog1) anim;    //Downcasting
            dog.bark();
        }
        if (anim instanceof Cat) {
            Cat cat = (Cat) anim;     //Downcasting
            cat.meow();
        }
    }
}