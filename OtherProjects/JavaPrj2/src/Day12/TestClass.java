package Day12;

 final class ImmutableStudent {
    private final int id;
    private final String name;
    public ImmutableStudent(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

 
//class Student1 extends ImmutableStudent{
//	
//}
class TestClass {
  public static void main(String[] args) {
    ImmutableStudent student = new ImmutableStudent(1, "Alex");
    System.out.println("ID: "+student.getId()+" Name: "+student.getName());
 }
}
