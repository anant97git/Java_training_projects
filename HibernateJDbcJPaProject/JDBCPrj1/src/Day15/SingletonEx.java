package Day15;

// VERY IMPORTANT Program showing use of private constructor
// if we are using private constructor in a class, then we cannot make object of that class in
// other class by using "new keyword". If, we want that there should be a single object for a class
//, then we should use singleton design.

class Singleton  {
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;
     // variable of type String
    public String s;
     // private constructor restricted to this class itself
    private Singleton()     {
        s = "Hello I am a string part of Singleton class";
    }
// static method to create instance of Singleton class
    public static Singleton getInstance()     {
        if (single_instance == null)
            single_instance = new Singleton();
         return single_instance;
    }
}
class SingletonEx  {
    public static void main(String args[])     {
        // instantiating Singleton class with variable x, y, z
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
         // changing variable of instance x
        x.s = (x.s).toUpperCase();

System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
         // changing variable of instance z
        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        
//        Singleton w = new Singleton();
        
    }
}
