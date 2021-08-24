package first;

class Student{
    int rollno;
    static String college = "ITS";
    
     void change(){      college = "BBDIT";      }
    Student(int r){  rollno = r; }
    void display (){System.out.println(rollno+" "+college);}
   public static void main(String args[]){
      Student s1 = new Student (111);
      Student s2 = new Student (222);
      s1.display(); //111 ITS
      s1.change();
      System.out.println(Student.college);
       s1.display(); // 111 BBDIT
       s2.display(); // 222 BBDIT
   }
}